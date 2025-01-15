package needed.instruments;

import enums.InstrumentType;
import needed.interfaces.ProduceSound;

public class Violin extends Instrument implements ProduceSound {

    private String sound = "Пу-пу-пу-у-у-у-у-у-у";

    private double weight;
    private double efficiency;
    private InstrumentType instrumentType;

    HelpPart bow;

    public Violin(double weight, double efficiency) {
        super(weight, efficiency, InstrumentType.VIOLIN);

        setDefaultSound(sound);

        bow = new Bow();
    }

}
