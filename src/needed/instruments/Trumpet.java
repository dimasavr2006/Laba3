package needed.instruments;

import needed.interfaces.ProduceSound;

public class Trumpet implements ProduceSound {

    private double weight;
    private double efficiency;

    private String sound = "Ту-ту-ту-у-у-у";

    public Trumpet(double weight, double efficiency) {

        this.weight = weight;
        this.efficiency = efficiency;

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
