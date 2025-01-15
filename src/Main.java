import exceptions.*;
import needed.ActionMaker;

public static void main(String[] args) throws WrongArmPositionException, WrongHeadNodAngleException, WallIsAlreadyExistsException, BecomeDeafException, SomeoneIsPlayingException, NotMovingArmsException, WallHeightException, WrongHeadAngleException, MusicianIsTooWeakException {

//        Locator locator = new Locator();
//
//        locator.mainGeneratorOfPlace();
//
//        ActionMaker actionMaker = new ActionMaker();
//        actionMaker.starter();

    ActionMaker.staticStarter();

    /*
    поправить солид (модификаторы доступа)

    люди со скрипками и трубами, не через енам а через наличие инструмента в руке

    переместить задание музыкантов

    развернуть в 3д

    действие с музыкальными инструментами (взять в руку и тд. хватание трубы и тд, интерфейс )

    небольшой огрех: инструмент появляется вместе с музыкантом, но берёт он его не сразу

    */

    }