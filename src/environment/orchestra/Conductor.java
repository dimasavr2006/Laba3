package environment.orchestra;

import enums.*;
import exceptions.*;
import location.Locator;
import needed.ActionMaker;
import needed.interfaces.*;

// DIRIZHER ESLI CHTO
public class Conductor extends Musician implements MakeToPlay{

    String name = "Иоганн Штраус";

    static Locator locator = ActionMaker.locator;

    final Stick whiteStick = new Stick(5, Colours.WHITE);

    static OrchestraAll orchestraAll = ActionMaker.getOrchestraAll();

    ViolinPartOfOrchestra localViolins = orchestraAll.getViolinPartOfOrchestra();
    TrumpetPartOfOrchestra localTrumpets = orchestraAll.getTrumpetPartOfOrchestra();

    public Conductor(InstrumentType instrumentType){
        super(InstrumentType.NOINSTRUMENT);

        this.name = "Иоганн Штраус";
        this.rArm.inHand.add(whiteStick);

        setXCoord(locator.getNpcConductorXCoordinate());
        setYCoord(locator.getNpcConductorYCoordinate());

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
    public void makeToPlay(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, NotMovingArmsException, MusicianIsTooWeakException {
        checkIsPlayingAndTurnToAnotherCondition(localViolins.violinsAll, true, isNeededToMoveArms);
        checkIsPlayingAndTurnToAnotherCondition(localTrumpets.trumpetsAll, true, isNeededToMoveArms);
        for (int i = 0; i < localTrumpets.trumpetsAll.length; i++){
            for (int j = 0; j < localTrumpets.trumpetsAll[i].length; j++){
                localTrumpets.trumpetsAll[i][j].takeInstrument(localTrumpets.trumpetsAll[i][j].instrumentType);
            }
        }
        for (int i = 0; i < localViolins.violinsAll.length; i++){
            for (int j = 0; j < localViolins.violinsAll[i].length; j++){
                localViolins.violinsAll[i][j].takeInstrument(localViolins.violinsAll[i][j].instrumentType);
            }
        }
    }

    public void makeStopPlaying(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, NotMovingArmsException, MusicianIsTooWeakException {
        checkIsPlayingAndTurnToAnotherCondition(localTrumpets.trumpetsAll, false, isNeededToMoveArms);
        checkIsPlayingAndTurnToAnotherCondition(localViolins.violinsAll, false, isNeededToMoveArms);
        stickFollowing();
        for (int i = 0; i < localTrumpets.trumpetsAll.length; i++){
            for (int j = 0; j < localTrumpets.trumpetsAll[i].length; j++){
                localTrumpets.trumpetsAll[i][j].layInstrument(localTrumpets.trumpetsAll[i][j].instrumentType);
            }
        }
        for (int i = 0; i < localViolins.violinsAll.length; i++){
            for (int j = 0; j < localViolins.violinsAll[i].length; j++){
                localViolins.violinsAll[i][j].layInstrument(localViolins.violinsAll[i][j].instrumentType);
            }
        }
    }

    public void stickFollowing(){
        whiteStick.setAngle(this.rArm.getHandAngleOnArm());
    }

    private void checkIsPlayingAndTurnToAnotherCondition(Musician[][] partOfOrchestra, boolean checkingCondition, boolean needToMoveArms) throws SomeoneIsPlayingException, NotMovingArmsException, MusicianIsTooWeakException {

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
                if (checkingCondition){
                    musician.play(musician);
                }

                musician.isPlaying = checkingCondition;
            }
        }
        stickFollowing();

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
    }

}
