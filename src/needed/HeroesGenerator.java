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
import needed.utils.*;

public class HeroesGenerator {

    Margarita margarita;
    Begemot begemot;
    Frachnik[] frachniks;
    Korovyev korovyev;

    public HeroesGenerator() throws WallIsAlreadyExistsException, WallHeightException {


        this.margarita = new Margarita();
        this.begemot = new Begemot();

        this.frachniks = new Frachnik[2];
        this.frachniks[0] = new Frachnik();
        this.frachniks[1] = new Frachnik();

        this.korovyev = new Korovyev();

    }
}
