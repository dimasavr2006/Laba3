package environment.orchestra;

import enums.*;
import exceptions.*;
import needed.interfaces.*;

// DIRIZHER ESLI CHTO
public class Conductor extends Musician implements MakeToPlay{

    final String name;

    final Stick whiteStick = new Stick(5, Colours.WHITE);

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
        lArm.setCoordY(1);
        lArm.setCoordY(y2);

    }

    @Override
    public void makeToPlay(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException, NotMovingArmsException {

        OrchestraAll orchestraAll = new OrchestraAll();
        Musician[][] partViolin = orchestraAll.violinPartOfOrchestra.violinsAll;
        Musician[][] partTrumpet = orchestraAll.trumpetPartOfOrchestra.trumpetsAll;

        checkIsPlayingAndTurnToAnotherCondition(orchestraAll.violinPartOfOrchestra.violinsAll, true, isNeededToMoveArms);
        checkIsPlayingAndTurnToAnotherCondition(orchestraAll.trumpetPartOfOrchestra.trumpetsAll, true, isNeededToMoveArms);
    }

    public void makeStopPlaying() throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException, NotMovingArmsException {

        OrchestraAll orchestraAll = new OrchestraAll();
        Musician[][] partViolin = orchestraAll.violinPartOfOrchestra.violinsAll;
        Musician[][] partTrumpet = orchestraAll.trumpetPartOfOrchestra.trumpetsAll;

        checkIsPlayingAndTurnToAnotherCondition(orchestraAll.trumpetPartOfOrchestra.trumpetsAll, false, false);
        checkIsPlayingAndTurnToAnotherCondition(orchestraAll.violinPartOfOrchestra.violinsAll, false, false);
    }

    public void stickFollowing(){
        whiteStick.setAngle(this.rArm.handAngleOnArm);
    }

    private void checkIsPlayingAndTurnToAnotherCondition(Musician[][] partOfOrchestra, boolean checkingCondition, boolean needToMoveArms) throws SomeoneIsPlayingException, NotMovingArmsException {

        if (needToMoveArms){
            armsMover();
        }

        for (Musician[] musicians : partOfOrchestra) {
            for (Musician musician : musicians) {
                if (musician.isPlaying == checkingCondition) {
                    switch (isPlaying) {
                        case true -> throw new SomeoneIsPlayingException("Кто-то халявил!!!");
                        case false -> throw new SomeoneIsPlayingException("Кто-то уже играет!!!");
                    }
                }
                musician.isPlaying = checkingCondition;
            }
        }

    }

    public static class Stick{

        public final double length;
        public final Colours colour;
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
