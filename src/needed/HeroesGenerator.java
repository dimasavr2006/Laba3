package needed;

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

public class HeroesGenerator {

    public HeroesGenerator() throws WallIsAlreadyExistsException, WallHeightException {


        Margarita margarita = new Margarita();
        Begemot begemot = new Begemot();

        Frachnik[] frachniks = new Frachnik[2];
        frachniks[0] = new Frachnik();
        frachniks[1] = new Frachnik();

        Korovyev korovyev = new Korovyev();


    }
}
