package needed.instruments;

import enums.InstrumentType;
import needed.interfaces.ProduceSound;

public class Trumpet extends Instrument implements ProduceSound{

    private String sound = "Ту-ту-ту-у-у-у";

    private double weight;
    private double efficiency;
    private InstrumentType instrumentType;

    public Trumpet(double weight, double efficiency) {

        super(weight, efficiency, InstrumentType.TRUMPET);

    }

    public void playSmth(){
        produceSound(sound);
    }

    public double getWeight() {
        return weight;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public String getSound() {
        return sound;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
