package environment.orchestra;

import environment.heroes.*;
import environment.*;
import environment.orchestra.*;
import environment.fakeEnvironment.*;
import enums.*;
import exceptions.*;
import location.*;
import needed.*;
import needed.interfaces.*;
import needed.parts.*;
import needed.utils.*;
// DIRIZHER ESLI CHTO
public class Conductor extends Musician implements MakeToPlay{

    public Conductor(InstrumentType instrumentType){
        super(InstrumentType.NOINSTRUMENT);
    }

    @Override
    public void makeToPlay() throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException {

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

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }
}
