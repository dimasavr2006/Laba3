package environment.orchestra;

import enums.*;
import exceptions.*;
import needed.*;
import needed.instruments.Bow;
import needed.instruments.Trumpet;
import needed.instruments.Violin;
import needed.utils.gens.*;

import java.util.Random;

public class Musician extends Human{

    final InstrumentType instrumentType;
    boolean isPlaying = false;
    final boolean isHealthy;

    Random random = new Random();

    Violin violin = new Violin(random.nextDouble(2, 4), random.nextDouble(80, 100));
    Bow bow = new Bow();
    Trumpet trumpet = new Trumpet(random.nextDouble(3, 5), random.nextDouble(80, 100));

    public Musician(InstrumentType instrumentType){
        super();

        if (Math.random() < 0.5){
            setGender(Gender.FEMALE);
        }

        musicianNamer(getGender());

        this.instrumentType = instrumentType;

        this.isHealthy = !(Math.random() <= 0.001);

    }

    public void healthyChecker(Musician musician) throws SomeoneInOrchestraIsSickException {

        if (!musician.isHealthy){
            throw new SomeoneInOrchestraIsSickException("Кто-то в оркестре болен!");
        }

    }

    private void musicianNamer(Gender gender){

        if (gender == Gender.MALE){
            setName(NameGen.getRandomNameFromFile("src/needed/utils/gens/male_names_rus.txt"));
        }
        else if (gender == Gender.FEMALE){
            setName(NameGen.getRandomNameFromFile("src/needed/utils/gens/female_names_rus.txt"));
        }

    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void takeInstrument(){

        switch (instrumentType){
            case VIOLIN -> {

                lArm.setAngleOnBody(45);
                rArm.setAngleOnBody(45);
                lArm.inHand.add(violin);
                rArm.inHand.add(bow);
                lArm.setAngleOnBody(90);
                rArm.setAngleOnBody(90);
                lArm.setHandAngleOnArm(90);
                rArm.setHandAngleOnArm(90);
            }
            case TRUMPET -> {

                lArm.setAngleOnBody(45);
                rArm.setAngleOnBody(45);
                lArm.inHand.add(trumpet);
                rArm.inHand.add(trumpet);
                lArm.setAngleOnBody(90);
                rArm.setAngleOnBody(lArm.getAngleOnBody());
                lArm.setHandAngleOnArm(90);
                rArm.setHandAngleOnArm(lArm.getHandAngleOnArm());
            }
        }

    }

    public void layInstrument(){
        switch (instrumentType){
            case VIOLIN -> {

                rArm.setHandAngleOnArm(0);
                lArm.setHandAngleOnArm(0);
                rArm.setAngleOnBody(45);
                lArm.setAngleOnBody(45);
                rArm.inHand.remove(bow);
                lArm.inHand.remove(violin);
                rArm.setAngleOnBody(0);
                lArm.setAngleOnBody(0);

            }

            case TRUMPET -> {

                rArm.setHandAngleOnArm(0);
                lArm.setHandAngleOnArm(rArm.getHandAngleOnArm());
                rArm.setAngleOnBody(45);
                lArm.setAngleOnBody(rArm.getAngleOnBody());
                rArm.inHand.remove(trumpet);
                lArm.inHand.remove(trumpet);
                rArm.setAngleOnBody(0);
                lArm.setAngleOnBody(rArm.getAngleOnBody());
            }
        }
    }

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }

    @Override
    public String toString() {
        return "Музыкант, играющий на " + instrumentType + "здоров?: " + isHealthy;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * (int) getHeight();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Musician musician)) {
            return false;
        }
        return musician.getName().equals(getName()) && musician.getInstrumentType() == getInstrumentType();
    }
}
