package location;

import needed.utils.*;


import java.util.Random;

public class Locator {

    // TUT RASPISAT RAZMESHENIA OBIEKTOV V ZALE
    final Random random = new Random();

    Utils utuls = new Utils();


    public Locator() {

        mainGeneratorOfPlace();

    }

    //VARIABLES OF PLACES
    public static double roomXCoordinate;
    public static double roomYCoordinate;

    public static double orchestraAnsambleStartXCoordinate;
    public static double orchestraAnsambleStartYCoordinate;
    public static double orchestraAnsambleEndXCoordinate;
    public static double orchestraAnsambleEndYCoordinate;

    public static double orchestraAnsambleViolinStartXCoordinate;
    public static double orchestraAnsambleViolinStartYCoordinate;
    public static double orchestraAnsambleViolinEndXCoordinate;
    public static double orchestraAnsambleViolinEndYCoordinate;

    public static double orchestraAnsambleOtherStartXCoordinate;
    public static double orchestraAnsambleOtherStartYCoordinate;
    public static double orchestraAnsambleOtherEndXCoordinate;
    public static double orchestraAnsambleOtherEndYCoordinate;

    public static double wallXCoordinate;
    public static double wallYCoordinate;

    public static double fakeEnvironmentXStartCoordinate;
    public static double fakeEnvironmentXEndCoordinate;
    public static double fakeEnvironmentYStartCoordinate;
    public static double fakeEnvironmentYEndCoordinate;


    // CAN CHANGE
    public static double heroMargaritaXCoordinate;
    public static double heroMargaritaYCoordinate;

    public static double heroBegemotXCoordinate;
    public static double heroBegemotYCoordinate;
    public static double heroKorovyevXCoordinate;
    public static double heroKorovyevYCoordinate;

// END OF CAN CHANGE

    public static double npcConductorXCoordinate;
    public static double npcConductorYCoordinate;

    public static double npcVietanXCoordinate;
    public static double npcVietanYCoordinate;

    public static double npcFrachnikXCoordinate;
    public static double npcFrachnikYCoordinate;



    private void mainGeneratorOfPlace() {

        roomXCoordinate = random.nextDouble(90, 180);
        roomYCoordinate = random.nextDouble(160, 320);

        heroMargaritaXCoordinate = roomXCoordinate / 2;
        heroMargaritaYCoordinate = roomYCoordinate * 0.1;

        wallXCoordinate = heroMargaritaXCoordinate;
        wallYCoordinate = heroMargaritaYCoordinate + 1;

        npcFrachnikXCoordinate = wallXCoordinate;
        npcFrachnikYCoordinate = wallYCoordinate + 1;

        orchestraAnsambleStartXCoordinate = 0;
        orchestraAnsambleStartYCoordinate = npcFrachnikYCoordinate + 0.1 * roomYCoordinate;
        orchestraAnsambleEndXCoordinate = roomXCoordinate;
        orchestraAnsambleEndYCoordinate = 0.35 * roomYCoordinate;

        orchestraAnsambleViolinStartXCoordinate = orchestraAnsambleStartXCoordinate;
        orchestraAnsambleViolinEndXCoordinate = orchestraAnsambleEndXCoordinate / 2;
        orchestraAnsambleViolinStartYCoordinate = orchestraAnsambleStartYCoordinate;
        orchestraAnsambleViolinEndYCoordinate = orchestraAnsambleEndYCoordinate;

        orchestraAnsambleOtherStartXCoordinate = orchestraAnsambleViolinEndXCoordinate;
        orchestraAnsambleOtherEndXCoordinate = roomXCoordinate;
        orchestraAnsambleOtherStartYCoordinate = orchestraAnsambleViolinStartYCoordinate;
        orchestraAnsambleOtherEndYCoordinate = orchestraAnsambleViolinEndYCoordinate;

        npcConductorXCoordinate = orchestraAnsambleOtherStartXCoordinate;
        npcConductorYCoordinate = orchestraAnsambleOtherStartYCoordinate;

        npcVietanXCoordinate = orchestraAnsambleViolinStartXCoordinate * 1.1;
        npcVietanYCoordinate = orchestraAnsambleViolinStartYCoordinate;

        fakeEnvironmentXStartCoordinate = 0;
        fakeEnvironmentXEndCoordinate = roomXCoordinate;
        fakeEnvironmentYStartCoordinate = orchestraAnsambleEndYCoordinate;
        fakeEnvironmentYEndCoordinate = roomYCoordinate;
    }
}
