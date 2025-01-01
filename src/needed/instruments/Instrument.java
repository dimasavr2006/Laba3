package needed.instruments;

import needed.interfaces.MakeSound;

public abstract class Instrument implements MakeSound {

    private double weight;
    private double efficiency;

    private String defaultSound;

    public Instrument(double weight, double efficiency){
        this.weight = weight;
        this.efficiency = efficiency;
    }

    public void playMelody(){
        makeSound(defaultSound);
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
