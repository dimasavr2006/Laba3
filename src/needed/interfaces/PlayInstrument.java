package needed.interfaces;

import environment.orchestra.Musician;
import exceptions.MusicianIsTooWeakException;
import needed.instruments.Instrument;

public interface PlayInstrument {

    public default void play(Musician musician) throws MusicianIsTooWeakException {

        Instrument instrumentL = (Instrument) musician.lArm.inHand.getFirst();

        if (!((instrumentL.getEfficiency() * instrumentL.getWeight()) > ((double) musician.hashCode() / (Math.pow(10, 10))))) {
            throw new MusicianIsTooWeakException("Музыкант слишком слаб для игры на данном инструменте");
        }

        musician.setPlaying(true);

    }

}
