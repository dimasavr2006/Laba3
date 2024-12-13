package needed.utils;

import environment.heroes.Margarita;
import exceptions.WallHeightException;
import exceptions.WallIsAlreadyExistsException;
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

public class Utils {

    public PairCoordinates pairCoordinatesGenerator(double x, double y) {
        return new PairCoordinates(x, y);
    }

    public void wallGrowHeightChecker(double margaritaHeight, double wallHeight) throws WallHeightException {

        if (margaritaHeight > wallHeight){
            throw new WallHeightException("стена слишком низкая");
        }
    }
    public void wallExistenceChecker (Wall wall) throws WallIsAlreadyExistsException {

        if (wall.isExists == true){

            throw new WallIsAlreadyExistsException("стена уже есть");

        }

    }


}
