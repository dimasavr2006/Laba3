package needed;

import environment.heroes.*;
import exceptions.*;

public class HeroesGenerator {

    Margarita margarita;
    Begemot begemot;
    Frachnik[] frachniks;
    Korovyev korovyev;

    public HeroesGenerator() {
    }
    public void starter() throws WallIsAlreadyExistsException, WallHeightException {
        this.margarita = new Margarita();
        this.begemot = new Begemot();

        this.frachniks = new Frachnik[2];
        this.frachniks[0] = new Frachnik();
        this.frachniks[1] = new Frachnik();

        this.korovyev = new Korovyev();
    }
}
