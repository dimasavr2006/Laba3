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

    int wallRandomHeightStart = 160;
    int wallRandomHeightEnd = 180;
    int wallRandomWidthStart = 80;
    int wallRandomWidthEnd = 150;

    int height = random.nextInt(wallRandomHeightStart, wallRandomHeightEnd);
    int width = random.nextInt(wallRandomWidthStart, wallRandomWidthEnd);

    Tulip[][] tulipArray = new Tulip[width][height];

    public Wall(){

        this.height = height;
        this.width = width;

        if (Math.random() < 0.001){
            this.isExists = true;
        }
        else {
            this.isExists = false;
        }

    }

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

    public void checkWallHeightBtwMargarita(){

        try{
            if (wallRandomHeightEnd < Margarita.height){
                throw new WallWrongInputHeightException(String.valueOf(wallRandomHeightEnd), String.valueOf(Margarita.height));
            }
        } catch (WallWrongInputHeightException e) {
            throw new RuntimeException(e);

        }

    }




}
