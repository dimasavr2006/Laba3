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

        if (frachniks[0] == frachniks[1]) {
            throw new IdenticFrachnikException("Фрачники одинаковы");
        }

        this.korovyev = new Korovyev();
    }

    public Margarita getMargarita() {
        return margarita;
    }

    public Begemot getBegemot() {
        return begemot;
    }

    public Frachnik[] getFrachniks() {
        return frachniks;
    }

    public Korovyev getKorovyev() {
        return korovyev;
    }
}
