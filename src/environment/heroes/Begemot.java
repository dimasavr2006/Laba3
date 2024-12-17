package environment.heroes;

import environment.heroes.*;
import environment.*;
import environment.orchestra.*;
import environment.fakeEnvironment.*;
import enums.*;
import exceptions.*;
import location.*;
import needed.*;
import needed.interfaces.*;
import needed.utils.*;

public class Begemot extends Human {

    Gender gender = Gender.FEMALE;
    double age = 25;
    String name = "Бегемот";

    public Begemot() {
        super();
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public void fakeEnvironmentCreator(){

        TropicalGarden tropicalGarden = new TropicalGarden();

    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }
}
