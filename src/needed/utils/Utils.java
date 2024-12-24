package needed.utils;

import environment.*;
import environment.orchestra.Musician;
import exceptions.*;
import needed.*;

public class Utils {

    public void wallGrowHeightChecker(double margaritaHeight, double wallHeight) throws WallHeightException {

        if (margaritaHeight > wallHeight){
            throw new WallHeightException("стена слишком низкая");
        }
    }
    public void wallExistenceChecker (Wall wall) throws WallIsAlreadyExistsException {

        if (wall.isExists){

            throw new WallIsAlreadyExistsException("стена уже есть");

        }

    }

    public void earHPChecker(Human human) throws BecomeDeafException {

        if (human.getEarHP() <= 0){

            throw new BecomeDeafException("Было слишком громко, кто-то оглох");

        }

    }
}
