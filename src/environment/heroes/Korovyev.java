package environment.heroes;

import enums.*;
import location.Locator;
import needed.*;

public class Korovyev extends Human {

    Gender gender = Gender.MALE;
    double age = 43;
    String name = "Мрачный рыцарь";

    public Korovyev() {
        super();
        xCoord = Locator.heroKorovyevXCoordinate;
        yCoord = Locator.heroKorovyevYCoordinate;
    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }
}
