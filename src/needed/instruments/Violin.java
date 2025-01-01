package needed.instruments;

import needed.interfaces.MakeSound;

public class Violin extends Instrument implements MakeSound {

    private String sound = "Пу-пу-пу-у-у-у-у-у-у";

    public Violin(double weight, double efficiency) {
        super(weight, efficiency);

        setDefaultSound(sound);

        Bow bow = new Bow();
        
    }

}
