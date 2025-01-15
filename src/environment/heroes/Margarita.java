package environment.heroes;

import environment.*;
import enums.*;
import exceptions.*;
import location.Locator;
import needed.*;
import needed.utils.*;

import java.util.ArrayList;

public class Margarita extends Human {

    Gender gender = Gender.FEMALE;
    double age = 33;
    String name = "Маргарита";

    static Locator locator = ActionMaker.locator;

    public Margarita() throws WallHeightException, WallIsAlreadyExistsException {
        super();

        setXCoord(locator.getHeroMargaritaXCoordinate());
        setYCoord(locator.getHeroMargaritaYCoordinate());

        double height = 5000;

        try {
            if (wall.getWallRandomHeightEnd() < height) {
                throw new WallWrongInputHeightException(wall.getWallRandomHeightEnd(), height);
            }
        }
        catch (WallWrongInputHeightException e) {
            throw new WallHeightException(e.getMessage());
        }

        utils.wallExistenceChecker(wall);

        utils.wallGrowHeightChecker(height, wall.getHeight());
        wall.tulipGrowerOnWall();

        visionList.add(wall);
//        utils.moveHero(Locator.heroMargaritaXCoordinate, 0, Locator.heroMargaritaYCoordinate, 2);

        visionList.remove(wall);

    }

    public final Wall wall = new Wall();

    final Utils utils = new Utils();

    public static final ArrayList<Object> visionList = new ArrayList<>();

    public static final ArrayList<Human> visionListHuman = new ArrayList<>();


    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {
        setXCoord(locator.getHeroMargaritaXCoordinate() + moveOnXAxis);
        setYCoord(locator.getHeroMargaritaYCoordinate() + moveOnYAxis);
    }

}
