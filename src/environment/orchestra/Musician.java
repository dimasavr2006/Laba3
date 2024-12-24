package environment.orchestra;

import enums.*;
import exceptions.*;
import needed.*;
import needed.utils.gens.*;

import java.util.Random;

public class Musician extends Human{

    Random random = new Random();

    final InstrumentType instrumentType;
    boolean isPlaying = false;
    final boolean isHealthy;

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

    @Override
    public void moveHero(double moveOnXAxis, double moveOnYAxis) {

    }

    @Override
    public String toString() {
        return "Музыкант, играющий на " + instrumentType + "здоров?: " + isHealthy;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * instrumentType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Musician musician = (Musician) obj;
        return musician.getName().equals(getName()) && musician.getInstrumentType() == getInstrumentType();
    }
}
