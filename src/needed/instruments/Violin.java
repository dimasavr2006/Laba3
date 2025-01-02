package needed.instruments;

import needed.interfaces.ProduceSound;

public class Violin extends Instrument implements ProduceSound {

    private String sound = "Пу-пу-пу-у-у-у-у-у-у";

    public Violin(double weight, double efficiency) {
        super(weight, efficiency);

        setDefaultSound(sound);

        Bow bow = new Bow();
        
    }

}
