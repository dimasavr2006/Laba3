package environment;

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

public class Wall{

    public boolean isExists;

    Random random = new Random();

    int height = random.nextInt(160, 180);
    int width = random.nextInt(80, 150);

    Tulip[][] tulipArray = new Tulip[width][height];

    public void tulipGrowerOnWall(){

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tulip tulip = new Tulip(random.nextInt(4, 6), random.nextBoolean());
            }
        }

    }
    public int getHeight(){
        return height;
    }



}
