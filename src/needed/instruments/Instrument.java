package needed.instruments;

import enums.InstrumentType;
import needed.interfaces.ProduceSound;

//public abstract class Instrument implements ProduceSound {
public class Instrument implements ProduceSound {

    private double weight;
    private double efficiency;
    private InstrumentType instrumentType;

    private String defaultSound;

    public Instrument(double weight, double efficiency, InstrumentType instrumentType){
        this.weight = weight;
        this.efficiency = efficiency;
        this.instrumentType = instrumentType;
    }

    public void playMelody(){
        produceSound(defaultSound);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public String getDefaultSound() {
        return defaultSound;
    }

    public void setDefaultSound(String defaultSound) {
        this.defaultSound = defaultSound;
    }
}
