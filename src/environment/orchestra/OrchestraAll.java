package environment.orchestra;

import enums.*;
import exceptions.SomeoneInOrchestraIsSickException;
import location.*;

public class OrchestraAll {

    public ViolinPartOfOrchestra violinPartOfOrchestra;
    public TrumpetPartOfOrchestra trumpetPartOfOrchestra;

    public OrchestraAll() throws SomeoneInOrchestraIsSickException {

        this.violinPartOfOrchestra = new ViolinPartOfOrchestra();
        this.trumpetPartOfOrchestra = new TrumpetPartOfOrchestra();

    }

    public ViolinPartOfOrchestra getViolinPartOfOrchestra() {
        return violinPartOfOrchestra;
    }
    public TrumpetPartOfOrchestra getTrumpetPartOfOrchestra() {
        return trumpetPartOfOrchestra;
    }

}
class ViolinPartOfOrchestra{

    double lenght;
    double height;

    int numberOfMusiciansInRow;
    int numberOfMusiciansInColumn;

    Musician[][] violinsAll;

    public ViolinPartOfOrchestra() throws SomeoneInOrchestraIsSickException {

        this.lenght = Math.abs(Locator.orchestraAnsambleViolinStartXCoordinate - Locator.orchestraAnsambleViolinEndXCoordinate);
        this.height = Math.abs(Locator.orchestraAnsambleViolinStartYCoordinate - Locator.orchestraAnsambleViolinEndYCoordinate);

        this.numberOfMusiciansInRow = (int) lenght / 10;
        this.numberOfMusiciansInColumn = (int) height / 10;

        this.violinsAll = new Musician[numberOfMusiciansInRow][numberOfMusiciansInColumn];

        for (int i = 0; i < numberOfMusiciansInRow; i++) {
            for (int j = 0; j < numberOfMusiciansInColumn; j++) {
                Musician musician = new Musician(InstrumentType.VIOLIN);
                violinsAll[i][j] = musician;

                musician.healthyChecker(musician);

                if (i == 1 && j == 1){
                    violinsAll[i][j].setName("Виетан");
                }

            }
        }
    }
}
class TrumpetPartOfOrchestra{

    double lenght;
    double height;

    int numberOfMusiciansInRow;
    int numberOfMusiciansInColumn;

    Musician[][] trumpetsAll;

    public TrumpetPartOfOrchestra() throws SomeoneInOrchestraIsSickException {

        this.lenght = Math.abs(Locator.orchestraAnsambleOtherStartXCoordinate - Locator.orchestraAnsambleOtherEndXCoordinate);
        this.height = Math.abs(Locator.orchestraAnsambleOtherStartYCoordinate - Locator.orchestraAnsambleOtherEndYCoordinate);

        this.numberOfMusiciansInRow = (int) lenght / 10;
        this.numberOfMusiciansInColumn = (int) height / 10;

        this.trumpetsAll = new Musician[numberOfMusiciansInRow][numberOfMusiciansInColumn];

        for (int i = 0; i < numberOfMusiciansInRow; i++) {
            for (int j = 0; j < numberOfMusiciansInColumn; j++) {
                Musician musician = new Musician(InstrumentType.TRUMPET);
                trumpetsAll[i][j] = musician;

                musician.healthyChecker(musician);
            }
        }
    }

}