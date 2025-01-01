package needed.interfaces;

public interface MakeSound {

    default void makeSound(String sound){

        System.out.println(sound);

    }

}
