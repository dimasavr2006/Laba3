package environment.orchestra;

import enums.InstrumentType;
import exceptions.SomeoneInOrchestraIsSickException;
import location.Locator;

public class TrumpetPartOfOrchestra{

    final double lenght;
    final double height;

    final int numberOfMusiciansInRow;
    final int numberOfMusiciansInColumn;

    public final Musician[][] trumpetsAll;

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
