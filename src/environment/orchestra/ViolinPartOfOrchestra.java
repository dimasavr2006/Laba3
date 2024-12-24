package environment.orchestra;

import enums.InstrumentType;
import exceptions.SomeoneInOrchestraIsSickException;
import location.Locator;

public class ViolinPartOfOrchestra{

    final double lenght;
    final double height;

    final int numberOfMusiciansInRow;
    final int numberOfMusiciansInColumn;

    public final Musician[][] violinsAll;

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
