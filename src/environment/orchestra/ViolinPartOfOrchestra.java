package environment.orchestra;

import enums.InstrumentType;
import exceptions.SomeoneInOrchestraIsSickException;
import location.Locator;
import needed.ActionMaker;

public class ViolinPartOfOrchestra{

    double lenght;
    double height;

    final int numberOfMusiciansInRow;
    final int numberOfMusiciansInColumn;

    public final Musician[][] violinsAll;

    static Locator locator = ActionMaker.locator;

    public ViolinPartOfOrchestra() throws SomeoneInOrchestraIsSickException {

        this.lenght = Math.abs(locator.getOrchestraAnsambleViolinStartXCoordinate() - locator.getOrchestraAnsambleViolinEndXCoordinate());
        this.height = Math.abs(locator.getOrchestraAnsambleViolinStartYCoordinate() - locator.getOrchestraAnsambleViolinEndYCoordinate());

        this.numberOfMusiciansInRow = (int) lenght / 10;
        this.numberOfMusiciansInColumn = (int) height / 10;

        this.violinsAll = new Musician[numberOfMusiciansInRow][numberOfMusiciansInColumn];

        creatorOfPart();
    }

    public void creatorOfPart() throws SomeoneInOrchestraIsSickException {

        for (int i = 0; i < numberOfMusiciansInRow; i++) {
            for (int j = 0; j < numberOfMusiciansInColumn; j++) {
                Musician musician = new Musician(InstrumentType.VIOLIN);
                violinsAll[i][j] = musician;

                musician.healthyChecker(musician);

                if (i == 0 && j == 0){
                    violinsAll[i][j].setName("Виетан");
                }

            }
        }

    }
}
