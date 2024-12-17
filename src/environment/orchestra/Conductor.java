package environment.orchestra;

import enums.*;
import exceptions.*;
import needed.interfaces.*;

// DIRIZHER ESLI CHTO
public class Conductor extends Musician implements MakeToPlay{

    String name;

    Stick whiteStick = new Stick(5, Colours.WHITE);

    public Conductor(InstrumentType instrumentType){
        super(InstrumentType.NOINSTRUMENT);
        this.name = "Иоганн Штраус";
        this.rArm.inHand.add(whiteStick);

    }

    private void armsMover() throws NotMovingArmsException {

        double y1;
        double y2;

        if (lArm.getCoordY() == 1 && rArm.getCoordY() == 1){

            throw new NotMovingArmsException("Руки дирижёра не двигались");

        }
        else if (lArm.getCoordY() == 1 || rArm.getCoordY() == 1){
            throw new NotMovingArmsException("Одна из рук дирижёра не двигалась");
        }

        y1 = lArm.getCoordY();
        lArm.setCoordY(1);
        lArm.setCoordY(y1);

        y2 = lArm.getCoordY();
        lArm.setCoordX(1);
        lArm.setCoordX(y2);
    }

    @Override
    public void makeToPlay(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException, NotMovingArmsException {

        if (isNeededToMoveArms == true){
            armsMover();
        } else if (isNeededToMoveArms == false) {
            //
        }


        OrchestraAll orchestraAll = new OrchestraAll();
        Musician[][] partViolin = orchestraAll.violinPartOfOrchestra.violinsAll;
        Musician[][] partTrumpet = orchestraAll.trumpetPartOfOrchestra.trumpetsAll;

        for (int i = 0; i < partViolin.length; i++) {
            for (int j = 0; j < partViolin[i].length; j++) {

                if (partViolin[i][j].isPlaying == true){
                    throw new SomeoneIsPlayingException("Кто-то уже играет!!!");
                }

                partViolin[i][j].isPlaying = true;
            }
        }
        for (int i = 0; i < partTrumpet.length; i++) {
            for (int j = 0; j < partTrumpet[i].length; j++) {

                if (partTrumpet[i][j].isPlaying == true){
                    throw new SomeoneIsPlayingException("Кто-то уже играет!!!");
                }

                partTrumpet[i][j].isPlaying = true;
            }
        }

    }

    public void makeStopPlaying() throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException {

        OrchestraAll orchestraAll = new OrchestraAll();
        Musician[][] partViolin = orchestraAll.violinPartOfOrchestra.violinsAll;
        Musician[][] partTrumpet = orchestraAll.trumpetPartOfOrchestra.trumpetsAll;

        for (int i = 0; i < partViolin.length; i++) {
            for (int j = 0; j < partViolin[i].length; j++) {

                if (partViolin[i][j].isPlaying == false){
                    throw new SomeoneIsPlayingException("Кто-то халявил!!!");
                }

                partViolin[i][j].isPlaying = false;
            }
        }
        for (int i = 0; i < partTrumpet.length; i++) {
            for (int j = 0; j < partTrumpet[i].length; j++) {

                if (partTrumpet[i][j].isPlaying == false){
                    throw new SomeoneIsPlayingException("Кто-то халявил!!!");
                }

                partTrumpet[i][j].isPlaying = false;
            }
        }

    }

    public void stickFollowing(){
        whiteStick.setAngle(this.rArm.handAngleOnArm);
    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }

    public class Stick{

        public double length;
        public Colours colour;
        public double angle;

        public Stick(double length, Colours colour){
            this.length = length;
            this.colour = colour;
            this.angle = 0;
        }

        public void setAngle(double angle) {
            this.angle = angle;
        }

        public double getAngle() {
            return angle;
        }
    }

}
