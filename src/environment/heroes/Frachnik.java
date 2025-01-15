package environment.heroes;

import enums.*;
import needed.*;

import java.util.Random;

public class Frachnik extends Human {

    Random random = new Random();

    Gender gender = Gender.MALE;
    double age = (double) random.nextInt(17, 25);
    String name = "Фрачник";

    public Frachnik() {
        super();
    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }
}
