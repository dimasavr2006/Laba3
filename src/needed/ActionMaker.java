package needed;

import environment.heroes.*;
import environment.orchestra.*;
import environment.fakeEnvironment.*;
import enums.*;
import exceptions.*;
import location.*;

public class ActionMaker {

    public static Locator locator = new Locator();

    public ActionMaker(){

    }

    static HeroesGenerator heroesGenerator = new HeroesGenerator();

    static OrchestraAll orchestraAll;

    static TropicalGarden tg = Begemot.getTropicalGarden();

    static {
        try {
            orchestraAll = new OrchestraAll();
        } catch (SomeoneInOrchestraIsSickException e) {
            throw new RuntimeException(e);
        }
    }

    public static void staticStarter() throws WallIsAlreadyExistsException, WallHeightException, SomeoneIsPlayingException, NotMovingArmsException, WrongArmPositionException, BecomeDeafException, WrongHeadAngleException, WrongHeadNodAngleException, MusicianIsTooWeakException {
        heroesGenerator.starter();
        Conductor conductor = new Conductor(InstrumentType.NOINSTRUMENT);

        conductor.makeToPlay(false);

        Margarita.visionList.add(heroesGenerator.frachniks[0]);
        Margarita.visionList.add(heroesGenerator.frachniks[1]);

        heroesGenerator.margarita.moveHero(locator.getNpcConductorXCoordinate() - heroesGenerator.margarita.getXCoord(),  locator.getNpcConductorYCoordinate() - heroesGenerator.margarita.getYCoord());

        Margarita.visionList.clear();

        Margarita.visionListHuman.add(heroesGenerator.begemot);
        Margarita.visionListHuman.add(heroesGenerator.korovyev);

        ViolinPartOfOrchestra violins = orchestraAll.getViolinPartOfOrchestra();
        TrumpetPartOfOrchestra trumpets = orchestraAll.getTrumpetPartOfOrchestra();

        for (int i = 0; i < violins.violinsAll.length; i++){
            for (int j =0; j <violins.violinsAll[i].length; j++){
                Margarita.visionListHuman.add(orchestraAll.getIJMusician(violins.violinsAll, i, j));
            }
        }
        for (int i = 0; i < trumpets.trumpetsAll.length; i++){
            for (int j =0; j < trumpets.trumpetsAll[i].length; j++){
                Margarita.visionListHuman.add(orchestraAll.getIJMusician(trumpets.trumpetsAll, i, j));
            }
        }

        Margarita.visionList.add(conductor);

        conductor.turnBody(conductor, 180);
        conductor.slantBody(conductor, 90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, 90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, 90);
        conductor.slantBody(conductor, -90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, -90);
        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, -90);

        heroesGenerator.margarita.speak(150, "Приветствую вас, король вальсов!");
        heroesGenerator.margarita.changeSmileCondition(heroesGenerator.margarita);
        heroesGenerator.margarita.handOnArmSlanter(heroesGenerator.margarita, OrientationOfPart.LEFT, 15);
        heroesGenerator.margarita.handOnArmSlanter(heroesGenerator.margarita, OrientationOfPart.RIGHT, 15);

        heroesGenerator.margarita.handOnArmSlanter(heroesGenerator.margarita, OrientationOfPart.LEFT, -15);
        heroesGenerator.margarita.handOnArmSlanter(heroesGenerator.margarita, OrientationOfPart.RIGHT, -15);

        heroesGenerator.korovyev.speak(50, " Мало, мало, глядите налево, на первые скрипки, и кивните так, чтобы каждый думал, что вы его узнали в отдельности. Здесь только мировые знаменитости. Вот этому, за первым пультом, это Вьетан. Так, очень хорошо. Теперь дальше.");
        heroesGenerator.margarita.turningHead(heroesGenerator.margarita, 15);
        heroesGenerator.margarita.noddingHead(heroesGenerator.margarita, 45);
        heroesGenerator.margarita.turningHead(heroesGenerator.margarita, -15);
        heroesGenerator.margarita.noddingHead(heroesGenerator.margarita, -45);

        heroesGenerator.margarita.speak(50, "Кто дирижер?");

        heroesGenerator.begemot.speak(150, "Иоганн Штраус");

        heroesGenerator.begemot.speak(150, " и пусть меня повесят в тропическом саду на лиане, если на каком-нибудь балу когда-либо играл такой оркестр. Я приглашал его! И, заметьте, ни один не заболел и ни один не отказался");

        tg.liana.putHumanInLiana(heroesGenerator.begemot);
        tg.branchesCreator();
        tg.usingOfTreeAndBranch(tg.choseBranches(tg.branches), tg.deltaHPCalculator(heroesGenerator.begemot), true);

    }

    public static HeroesGenerator getHeroesGenerator() {
        return heroesGenerator;
    }

    public static OrchestraAll getOrchestraAll() {
        return orchestraAll;
    }

    //    public void starter() throws WallIsAlreadyExistsException, WallHeightException, SomeoneInOrchestraIsSickException, SomeoneIsPlayingException, NotMovingArmsException, WrongArmPositionException, BecomeDeafException, WrongHeadAngleException, WrongHeadNodAngleException {
//        HeroesGenerator heroesGen = new HeroesGenerator();
//        heroesGen.starter();
//        Conductor conductor = new Conductor(InstrumentType.NOINSTRUMENT);
//
//        conductor.makeToPlay(false);
//
//        Margarita.visionList.add(heroesGen.frachniks[0]);
//        Margarita.visionList.add(heroesGen.frachniks[1]);
//
//        heroesGen.margarita.moveHero(locator.getNpcConductorXCoordinate() - heroesGen.margarita.getXCoord(),  locator.getNpcConductorYCoordinate() - heroesGen.margarita.getYCoord());
//
//        Margarita.visionList.clear();
//
//
//        Margarita.visionListHuman.add(heroesGen.begemot);
//        Margarita.visionListHuman.add(heroesGen.korovyev);
//
//        for (int i = 0; i < orchestraAll.violinPartOfOrchestra.violinsAll.length; i++) {
//            for (int j = 0; j < orchestraAll.violinPartOfOrchestra.violinsAll[i].length; j++){
//
//                Margarita.visionListHuman.add(orchestraAll.getIJMusician(orchestraAll.violinPartOfOrchestra.violinsAll, i, j));
//
//            }
//        }
//        for (int i = 0; i < orchestraAll.trumpetPartOfOrchestra.trumpetsAll.length; i++) {
//            for (int j = 0; j < orchestraAll.trumpetPartOfOrchestra.trumpetsAll[i].length; j++) {
//
//                Margarita.visionListHuman.add(orchestraAll.getIJMusician(orchestraAll.trumpetPartOfOrchestra.trumpetsAll, i, j));
//
//            }
//        }
//
//        Margarita.visionListHuman.add(conductor);
//
////        conductor.makeStopPlaying();
//
//        conductor.turnBody(conductor, 180);
//        conductor.slantBody(conductor, 90);
//        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, 90);
//        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, 90);
//        conductor.slantBody(conductor, -90);
//        conductor.moveFullArmForDegree(conductor, OrientationOfPart.LEFT, -90);
//        conductor.moveFullArmForDegree(conductor, OrientationOfPart.RIGHT, -90);
//
//        heroesGen.margarita.speak(150, "Приветствую вас, король вальсов!");
//        heroesGen.margarita.changeSmileCondition(heroesGen.margarita);
//        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.LEFT, 15);
//        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.RIGHT, 15);
//
//        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.LEFT, -15);
//        heroesGen.margarita.handOnArmSlanter(heroesGen.margarita, OrientationOfPart.RIGHT, -15);
//
//        heroesGen.korovyev.speak(50, " Мало, мало, глядите налево, на первые скрипки, и кивните так, чтобы каждый думал, что вы его узнали в отдельности. Здесь только мировые знаменитости. Вот этому, за первым пультом, это Вьетан. Так, очень хорошо. Теперь дальше.");
//        heroesGen.margarita.turningHead(heroesGen.margarita, 15);
//        heroesGen.margarita.noddingHead(heroesGen.margarita, 45);
//        heroesGen.margarita.turningHead(heroesGen.margarita, -15);
//        heroesGen.margarita.noddingHead(heroesGen.margarita, -45);
//
//        heroesGen.margarita.speak(50, "Кто дирижер?");
//
//        heroesGen.begemot.speak(150, "Иоганн Штраус");
//
//        heroesGen.begemot.speak(150, " и пусть меня повесят в тропическом саду на лиане, если на каком-нибудь балу когда-либо играл такой оркестр. Я приглашал его! И, заметьте, ни один не заболел и ни один не отказался");
//
//        TropicalGarden tg = new TropicalGarden();
//        tg.liana.putHumanInLiana(heroesGen.begemot);
//        tg.branchesCreator();
//        tg.usingOfTreeAndBranch(tg.choseBranches(tg.branches), tg.deltaHPCalculator(heroesGen.begemot), true);
//    }

}
