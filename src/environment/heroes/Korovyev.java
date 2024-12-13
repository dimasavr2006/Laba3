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
import needed.parts.*;
import needed.utils.*;

public class Korovyev extends Human {

    Gender gender = Gender.MALE;
    double age = 43;
    String name = "Мрачный рыцарь";

    public Korovyev() {
        super();
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }
}
