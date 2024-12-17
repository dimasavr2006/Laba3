package environment.orchestra;

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

import java.util.Random;

public class Musician extends Human{

    Random random = new Random();

    InstrumentType instrumentType;
    boolean isPlaying = false;
    boolean isHealthy;

    public Musician(InstrumentType instrumentType){
        super();
        this.instrumentType = instrumentType;

        if (Math.random() <= 0.001){
            this.isHealthy = false;
        }
        else{
            this.isHealthy = true;
        }

    }

    public void healthyChecker(Musician musician) throws SomeoneInOrchestraIsSickException {

        if (musician.isHealthy == false){
            throw new SomeoneInOrchestraIsSickException("Кто-то в оркестре болен!");
        }

    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }
}
