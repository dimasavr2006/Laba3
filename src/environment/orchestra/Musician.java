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
import needed.parts.*;
import needed.utils.*;

import java.util.Random;

public class Musician extends Human{

    Random random = new Random();

    InstrumentType instrumentType;
    boolean isPlaying = false;

    public Musician(InstrumentType instrumentType){
        super();
        this.instrumentType = instrumentType;
    }

    @Override
    public void moveHero(double startXCoord, double moveOnXAxis, double startYAxis, double moveOnYAxis) {

    }
}
