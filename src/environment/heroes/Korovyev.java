package environment.heroes;

import enums.*;
import location.Locator;
import needed.*;

public class Korovyev extends Human {

    Gender gender = Gender.MALE;
    double age = 43;
    String name = "Мрачный рыцарь";

    Locator locator = new Locator();

    public Korovyev() {
        super();

        setXCoord(locator.getHeroKorovyevXCoordinate());
        setYCoord(locator.getHeroKorovyevYCoordinate());

    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }
}
