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

import java.util.ArrayList;
import java.util.Objects;

public class Margarita extends Human {

    Gender gender = Gender.FEMALE;
    double age = 33;
    String name = "Маргарита";

    double height = 165;

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



    static ArrayList<Object> visionList = new ArrayList<>();

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {
        startXCoord+=moveOnXAxis;
        startYAxis+=moveOnYAxis;
    }
}
