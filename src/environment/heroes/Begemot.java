package environment.heroes;

import environment.fakeEnvironment.*;
import enums.*;
import needed.*;

public class Begemot extends Human {

    Gender gender = Gender.FEMALE;
    double age = 25;
    String name = "Бегемот";

    public Begemot() {
        super();
    }

    public void fakeEnvironmentCreator(){

        TropicalGarden tropicalGarden = new TropicalGarden();

    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }
}
