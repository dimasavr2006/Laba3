package needed.instruments;

import java.util.Random;

public class Bow {

    Random random = new Random();

    private double lenght = random.nextDouble(45, 55);
    private double weight = random.nextDouble(0.5, 1);

    public Bow (){

    }

    public double getLenght() {
        return lenght;
    }

    public double getWeight() {
        return weight;
    }
}
