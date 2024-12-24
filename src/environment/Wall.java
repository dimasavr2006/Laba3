package environment;

import java.util.Random;

public class Wall{

    public final boolean isExists;

    final Random random = new Random();

    final int wallRandomHeightStart = 160;
    final int wallRandomHeightEnd = 180;
    final int wallRandomWidthStart = 80;
    final int wallRandomWidthEnd = 150;

    final int height = random.nextInt(wallRandomHeightStart, wallRandomHeightEnd);
    final int width = random.nextInt(wallRandomWidthStart, wallRandomWidthEnd);

    final Tulip[][] tulipArray = new Tulip[width][height];

    public Wall(){
        this.isExists = Math.random() < 0.001;

    }

    public void tulipGrowerOnWall(){

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tulip tulip = new Tulip(random.nextInt(4, 6), random.nextBoolean());
                tulipArray[i][j] = tulip;
            }
        }

    }
    public int getHeight(){
        return height;
    }

    public int getWallRandomHeightEnd() {
        return wallRandomHeightEnd;
    }
}
