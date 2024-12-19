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

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Margarita extends Human {

    Gender gender = Gender.FEMALE;
    double age = 33;
    String name = "Маргарита";

    public static double xCoord;
    public static double yCoord;

    public static final double height = 165;

    public Margarita() throws WallHeightException, WallIsAlreadyExistsException {
        super();
        this.gender = gender;
        this.age = age;
        this.name = name;

        utils.wallExistenceChecker(wall);

        utils.wallGrowHeightChecker(height, wall.getHeight());
        wall.tulipGrowerOnWall();

        visionList.add(wall);
//        utils.moveHero(Locator.heroMargaritaXCoordinate, 0, Locator.heroMargaritaYCoordinate, 2);

        visionList.remove(wall);

    }

    public Wall wall = new Wall();

    Utils utils = new Utils();

    Random random = new Random();

    public static ArrayList<Object> visionList = new ArrayList<>();

    public static ArrayList<Human> visionListHuman = new ArrayList<>();

    public double getHeight() {
        return height;
    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYCoord, double moveOnYAxis) {
        startXCoord+=moveOnXAxis;
        startYCoord+=moveOnYAxis;

        startXCoord = xCoord;
        startYCoord = yCoord;
    }
}
