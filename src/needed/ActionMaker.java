package needed;

import environment.heroes.*;
import environment.orchestra.*;
import environment.fakeEnvironment.*;
import enums.*;
import exceptions.*;
import location.*;


public class ActionMaker {

    public ActionMaker() throws WallIsAlreadyExistsException, WallHeightException, SomeoneInOrchestraIsSickException, SomeoneIsPlayingException, NotMovingArmsException, WrongArmPositionException, BecomeDeafException, WrongHeadAngleException, WrongHeadNodAngleException {

        HeroesGenerator heroesGen = new HeroesGenerator();
        Conductor conductor = new Conductor(InstrumentType.NOINSTRUMENT);

        conductor.makeToPlay(false);

        Margarita.visionList.add(heroesGen.frachniks[0]);
        Margarita.visionList.add(heroesGen.frachniks[1]);

        heroesGen.margarita.moveHero(Margarita.xCoord, Locator.npcConductorXCoordinate - Margarita.xCoord, Margarita.yCoord, Locator.npcConductorYCoordinate - Margarita.yCoord);

        Margarita.visionList.clear();

        //HIT BY MUSIC
        Margarita.visionListHuman.add(heroesGen.begemot);
        Margarita.visionListHuman.add(heroesGen.korovyev);

        OrchestraAll orchestraAll = new OrchestraAll();

        for (int i = 0; i < orchestraAll.violinPartOfOrchestra.violinsAll.length; i++) {
            for (int j = 0; j < orchestraAll.violinPartOfOrchestra.violinsAll[i].length; j++){

                Margarita.visionListHuman.add(orchestraAll.getIJMusician(orchestraAll.violinPartOfOrchestra.violinsAll, i, j));

            }
        }
        for (int i = 0; i < orchestraAll.trumpetPartOfOrchestra.trumpetsAll.length; i++) {
            for (int j = 0; j < orchestraAll.trumpetPartOfOrchestra.trumpetsAll[i].length; j++) {

                Margarita.visionListHuman.add(orchestraAll.getIJMusician(orchestraAll.trumpetPartOfOrchestra.trumpetsAll, i, j));

            }
        }

        Margarita.visionListHuman.add(conductor);

//        conductor.makeStopPlaying();

        conductor.turnBody(conductor, 180);
        conductor.slantBody(conductor, 90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, 90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, 90);
        conductor.slantBody(conductor, -90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, -90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, -90);

        heroesGen.margarita.speak(150, "Приветствую вас, король вальсов!");
        heroesGen.margarita.changeSmileCondition(heroesGen.margarita);
        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.LEFT, 15);
        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.RIGHT, 15);

        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.LEFT, -15);
        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.RIGHT, -15);

        heroesGen.korovyev.speak(50, " Мало, мало, глядите налево, на первые скрипки, и кивните так, чтобы каждый думал, что вы его узнали в отдельности. Здесь только мировые знаменитости. Вот этому, за первым пультом, это Вьетан. Так, очень хорошо. Теперь дальше.");
        heroesGen.margarita.turningHead(heroesGen.margarita, 15);
        heroesGen.margarita.noddingHead(heroesGen.margarita, 45);
        heroesGen.margarita.turningHead(heroesGen.margarita, -15);
        heroesGen.margarita.noddingHead(heroesGen.margarita, -45);

        heroesGen.margarita.speak(50, "Кто дирижер?");

        heroesGen.begemot.speak(150, "Иоганн Штраус");

        heroesGen.begemot.speak(150, " и пусть меня повесят в тропическом саду на лиане, если на каком-нибудь балу когда-либо играл такой оркестр. Я приглашал его! И, заметьте, ни один не заболел и ни один не отказался");

        TropicalGarden tg = new TropicalGarden();
        tg.liana.putHumanInLiana(heroesGen.begemot);


    }
}
