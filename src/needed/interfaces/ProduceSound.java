package needed.interfaces;

public interface ProduceSound {

    default void produceSound(String sound){

        System.out.println(sound);

    }

}
