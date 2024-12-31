package location;


import java.util.Random;

public class Locator {

    // TUT RASPISAT RAZMESHENIA OBIEKTOV V ZALE
    final Random random = new Random();

    public Locator() {

    }

    //VARIABLES OF PLACES
    private double roomXCoordinate;
    private double roomYCoordinate;

    private double orchestraAnsambleStartXCoordinate;
    private double orchestraAnsambleStartYCoordinate;
    private double orchestraAnsambleEndXCoordinate;
    private double orchestraAnsambleEndYCoordinate;

    private double orchestraAnsambleViolinStartXCoordinate;
    private double orchestraAnsambleViolinStartYCoordinate;
    private double orchestraAnsambleViolinEndXCoordinate;
    private double orchestraAnsambleViolinEndYCoordinate;

    private double orchestraAnsambleOtherStartXCoordinate;
    private double orchestraAnsambleOtherStartYCoordinate;
    private double orchestraAnsambleOtherEndXCoordinate;
    private double orchestraAnsambleOtherEndYCoordinate;

    private double wallXCoordinate;
    private double wallYCoordinate;

    private double fakeEnvironmentXStartCoordinate;
    private double fakeEnvironmentXEndCoordinate;
    private double fakeEnvironmentYStartCoordinate;
    private double fakeEnvironmentYEndCoordinate;


    // CAN CHANGE
    private double heroMargaritaXCoordinate;
    private double heroMargaritaYCoordinate;

    private double heroBegemotXCoordinate;
    private double heroBegemotYCoordinate;
    private double heroKorovyevXCoordinate;
    private double heroKorovyevYCoordinate;

// END OF CAN CHANGE

    private double npcConductorXCoordinate;
    private double npcConductorYCoordinate;

    private double npcVietanXCoordinate;
    private double npcVietanYCoordinate;

    private double npcFrachnikXCoordinate;
    private double npcFrachnikYCoordinate;



    public void mainGeneratorOfPlace() {

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

    public double getRoomXCoordinate() {
        return roomXCoordinate;
    }

    public double getRoomYCoordinate() {
        return roomYCoordinate;
    }

    public double getOrchestraAnsambleStartXCoordinate() {
        return orchestraAnsambleStartXCoordinate;
    }

    public double getOrchestraAnsambleStartYCoordinate() {
        return orchestraAnsambleStartYCoordinate;
    }

    public double getOrchestraAnsambleEndXCoordinate() {
        return orchestraAnsambleEndXCoordinate;
    }

    public double getOrchestraAnsambleEndYCoordinate() {
        return orchestraAnsambleEndYCoordinate;
    }

    public double getOrchestraAnsambleViolinStartXCoordinate() {
        return orchestraAnsambleViolinStartXCoordinate;
    }

    public double getOrchestraAnsambleViolinStartYCoordinate() {
        return orchestraAnsambleViolinStartYCoordinate;
    }

    public double getOrchestraAnsambleViolinEndXCoordinate() {
        return orchestraAnsambleViolinEndXCoordinate;
    }

    public double getOrchestraAnsambleViolinEndYCoordinate() {
        return orchestraAnsambleViolinEndYCoordinate;
    }

    public double getOrchestraAnsambleOtherStartXCoordinate() {
        return orchestraAnsambleOtherStartXCoordinate;
    }

    public double getOrchestraAnsambleOtherStartYCoordinate() {
        return orchestraAnsambleOtherStartYCoordinate;
    }

    public double getOrchestraAnsambleOtherEndXCoordinate() {
        return orchestraAnsambleOtherEndXCoordinate;
    }

    public double getOrchestraAnsambleOtherEndYCoordinate() {
        return orchestraAnsambleOtherEndYCoordinate;
    }

    public double getWallXCoordinate() {
        return wallXCoordinate;
    }

    public double getWallYCoordinate() {
        return wallYCoordinate;
    }

    public double getFakeEnvironmentXStartCoordinate() {
        return fakeEnvironmentXStartCoordinate;
    }

    public double getFakeEnvironmentXEndCoordinate() {
        return fakeEnvironmentXEndCoordinate;
    }

    public double getFakeEnvironmentYStartCoordinate() {
        return fakeEnvironmentYStartCoordinate;
    }

    public double getFakeEnvironmentYEndCoordinate() {
        return fakeEnvironmentYEndCoordinate;
    }

    public double getHeroMargaritaXCoordinate() {
        return heroMargaritaXCoordinate;
    }

    public double getHeroMargaritaYCoordinate() {
        return heroMargaritaYCoordinate;
    }

    public double getHeroBegemotXCoordinate() {
        return heroBegemotXCoordinate;
    }

    public double getHeroBegemotYCoordinate() {
        return heroBegemotYCoordinate;
    }

    public double getHeroKorovyevXCoordinate() {
        return heroKorovyevXCoordinate;
    }

    public double getHeroKorovyevYCoordinate() {
        return heroKorovyevYCoordinate;
    }

    public double getNpcConductorXCoordinate() {
        return npcConductorXCoordinate;
    }

    public double getNpcConductorYCoordinate() {
        return npcConductorYCoordinate;
    }

    public double getNpcVietanXCoordinate() {
        return npcVietanXCoordinate;
    }

    public double getNpcVietanYCoordinate() {
        return npcVietanYCoordinate;
    }

    public double getNpcFrachnikXCoordinate() {
        return npcFrachnikXCoordinate;
    }

    public double getNpcFrachnikYCoordinate() {
        return npcFrachnikYCoordinate;
    }

    public void setRoomXCoordinate(double roomXCoordinate) {
        this.roomXCoordinate = roomXCoordinate;
    }

    public void setRoomYCoordinate(double roomYCoordinate) {
        this.roomYCoordinate = roomYCoordinate;
    }

    public void setOrchestraAnsambleStartXCoordinate(double orchestraAnsambleStartXCoordinate) {
        this.orchestraAnsambleStartXCoordinate = orchestraAnsambleStartXCoordinate;
    }

    public void setOrchestraAnsambleStartYCoordinate(double orchestraAnsambleStartYCoordinate) {
        this.orchestraAnsambleStartYCoordinate = orchestraAnsambleStartYCoordinate;
    }

    public void setOrchestraAnsambleEndXCoordinate(double orchestraAnsambleEndXCoordinate) {
        this.orchestraAnsambleEndXCoordinate = orchestraAnsambleEndXCoordinate;
    }

    public void setOrchestraAnsambleEndYCoordinate(double orchestraAnsambleEndYCoordinate) {
        this.orchestraAnsambleEndYCoordinate = orchestraAnsambleEndYCoordinate;
    }

    public void setOrchestraAnsambleViolinStartXCoordinate(double orchestraAnsambleViolinStartXCoordinate) {
        this.orchestraAnsambleViolinStartXCoordinate = orchestraAnsambleViolinStartXCoordinate;
    }

    public void setOrchestraAnsambleViolinStartYCoordinate(double orchestraAnsambleViolinStartYCoordinate) {
        this.orchestraAnsambleViolinStartYCoordinate = orchestraAnsambleViolinStartYCoordinate;
    }

    public void setOrchestraAnsambleViolinEndXCoordinate(double orchestraAnsambleViolinEndXCoordinate) {
        this.orchestraAnsambleViolinEndXCoordinate = orchestraAnsambleViolinEndXCoordinate;
    }

    public void setOrchestraAnsambleViolinEndYCoordinate(double orchestraAnsambleViolinEndYCoordinate) {
        this.orchestraAnsambleViolinEndYCoordinate = orchestraAnsambleViolinEndYCoordinate;
    }

    public void setOrchestraAnsambleOtherStartXCoordinate(double orchestraAnsambleOtherStartXCoordinate) {
        this.orchestraAnsambleOtherStartXCoordinate = orchestraAnsambleOtherStartXCoordinate;
    }

    public void setOrchestraAnsambleOtherStartYCoordinate(double orchestraAnsambleOtherStartYCoordinate) {
        this.orchestraAnsambleOtherStartYCoordinate = orchestraAnsambleOtherStartYCoordinate;
    }

    public void setOrchestraAnsambleOtherEndXCoordinate(double orchestraAnsambleOtherEndXCoordinate) {
        this.orchestraAnsambleOtherEndXCoordinate = orchestraAnsambleOtherEndXCoordinate;
    }

    public void setOrchestraAnsambleOtherEndYCoordinate(double orchestraAnsambleOtherEndYCoordinate) {
        this.orchestraAnsambleOtherEndYCoordinate = orchestraAnsambleOtherEndYCoordinate;
    }

    public void setWallXCoordinate(double wallXCoordinate) {
        this.wallXCoordinate = wallXCoordinate;
    }

    public void setWallYCoordinate(double wallYCoordinate) {
        this.wallYCoordinate = wallYCoordinate;
    }

    public void setFakeEnvironmentXStartCoordinate(double fakeEnvironmentXStartCoordinate) {
        this.fakeEnvironmentXStartCoordinate = fakeEnvironmentXStartCoordinate;
    }

    public void setFakeEnvironmentXEndCoordinate(double fakeEnvironmentXEndCoordinate) {
        this.fakeEnvironmentXEndCoordinate = fakeEnvironmentXEndCoordinate;
    }

    public void setFakeEnvironmentYStartCoordinate(double fakeEnvironmentYStartCoordinate) {
        this.fakeEnvironmentYStartCoordinate = fakeEnvironmentYStartCoordinate;
    }

    public void setFakeEnvironmentYEndCoordinate(double fakeEnvironmentYEndCoordinate) {
        this.fakeEnvironmentYEndCoordinate = fakeEnvironmentYEndCoordinate;
    }

    public void setHeroMargaritaXCoordinate(double heroMargaritaXCoordinate) {
        this.heroMargaritaXCoordinate = heroMargaritaXCoordinate;
    }

    public void setHeroMargaritaYCoordinate(double heroMargaritaYCoordinate) {
        this.heroMargaritaYCoordinate = heroMargaritaYCoordinate;
    }

    public void setHeroBegemotXCoordinate(double heroBegemotXCoordinate) {
        this.heroBegemotXCoordinate = heroBegemotXCoordinate;
    }

    public void setHeroBegemotYCoordinate(double heroBegemotYCoordinate) {
        this.heroBegemotYCoordinate = heroBegemotYCoordinate;
    }

    public void setHeroKorovyevXCoordinate(double heroKorovyevXCoordinate) {
        this.heroKorovyevXCoordinate = heroKorovyevXCoordinate;
    }

    public void setHeroKorovyevYCoordinate(double heroKorovyevYCoordinate) {
        this.heroKorovyevYCoordinate = heroKorovyevYCoordinate;
    }

    public void setNpcConductorXCoordinate(double npcConductorXCoordinate) {
        this.npcConductorXCoordinate = npcConductorXCoordinate;
    }

    public void setNpcConductorYCoordinate(double npcConductorYCoordinate) {
        this.npcConductorYCoordinate = npcConductorYCoordinate;
    }

    public void setNpcVietanXCoordinate(double npcVietanXCoordinate) {
        this.npcVietanXCoordinate = npcVietanXCoordinate;
    }

    public void setNpcVietanYCoordinate(double npcVietanYCoordinate) {
        this.npcVietanYCoordinate = npcVietanYCoordinate;
    }

    public void setNpcFrachnikXCoordinate(double npcFrachnikXCoordinate) {
        this.npcFrachnikXCoordinate = npcFrachnikXCoordinate;
    }

    public void setNpcFrachnikYCoordinate(double npcFrachnikYCoordinate) {
        this.npcFrachnikYCoordinate = npcFrachnikYCoordinate;
    }
}
