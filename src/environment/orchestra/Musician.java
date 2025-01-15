package environment.orchestra;

import enums.*;
import exceptions.*;
import needed.*;
import needed.instruments.Bow;
import needed.instruments.HelpPart;
import needed.instruments.Instrument;
import needed.interfaces.PlayInstrument;
import needed.utils.gens.*;

import java.util.Random;

public class Musician extends Human implements PlayInstrument {

    InstrumentType instrumentType;
    boolean isPlaying = false;
    boolean isHealthy;

    Random random = new Random();

    Instrument instrument;
    HelpPart helpPart; // DOP INSTRUMENT AS BOW FOR VIOLIN

    public Musician(InstrumentType instrumentType){
        super();

        switch(instrumentType){
            case TRUMPET -> {
                instrument = new Instrument(random.nextDouble(3, 5), random.nextDouble(80, 100), instrumentType);

            }
            case VIOLIN ->{
                instrument = new Instrument(random.nextDouble(2, 4), random.nextDouble(80, 100), instrumentType);
                helpPart = new Bow();
            }
        }

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

    public void takeInstrument(InstrumentType instrumentType){

        switch (instrumentType){
            case VIOLIN -> {

                lArm.setAngleOnBody(45);
                rArm.setAngleOnBody(45);
                lArm.putObjectInHand(instrument);
                rArm.putObjectInHand(instrument);
                lArm.setAngleOnBody(90);
                rArm.setAngleOnBody(90);
                lArm.setHandAngleOnArm(90);
                rArm.setHandAngleOnArm(90);
            }
            case TRUMPET -> {

                lArm.setAngleOnBody(45);
                rArm.setAngleOnBody(45);
                lArm.putObjectInHand(instrument);
                rArm.putObjectInHand(instrument);
                lArm.setAngleOnBody(90);
                rArm.setAngleOnBody(lArm.getAngleOnBody());
                lArm.setHandAngleOnArm(90);
                rArm.setHandAngleOnArm(lArm.getHandAngleOnArm());
            }
        }

    }

    public void layInstrument(InstrumentType instrumentType){
        switch (instrumentType){
            case VIOLIN -> {

                rArm.setHandAngleOnArm(0);
                lArm.setHandAngleOnArm(0);
                rArm.setAngleOnBody(45);
                lArm.setAngleOnBody(45);
                rArm.inHand.remove(helpPart);
                lArm.inHand.remove(instrument);
                rArm.setAngleOnBody(0);
                lArm.setAngleOnBody(0);

            }

            case TRUMPET -> {

                rArm.setHandAngleOnArm(0);
                lArm.setHandAngleOnArm(rArm.getHandAngleOnArm());
                rArm.setAngleOnBody(45);
                lArm.setAngleOnBody(rArm.getAngleOnBody());
                rArm.inHand.remove(instrument);
                lArm.inHand.remove(instrument);
                rArm.setAngleOnBody(0);
                lArm.setAngleOnBody(rArm.getAngleOnBody());
            }
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isHealthy() {
        return isHealthy;
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
