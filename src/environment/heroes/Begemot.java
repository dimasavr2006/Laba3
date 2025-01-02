package environment.heroes;

import environment.fakeEnvironment.*;
import enums.*;
import location.Locator;
import needed.*;

public class Begemot extends Human {

    Gender gender = Gender.FEMALE;
    double age = 25;
    String name = "Бегемот";

    static Locator locator = ActionMaker.locator;

    private static TropicalGarden tropicalGarden = new TropicalGarden();

    public Begemot() {
        super();

        setXCoord(locator.getHeroBegemotXCoordinate());
        setYCoord(locator.getHeroBegemotYCoordinate());

    }

    public static TropicalGarden getTropicalGarden() {
        return tropicalGarden;
    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }
}
