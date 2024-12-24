import exceptions.*;
import location.Locator;
import needed.ActionMaker;

public static void main(String[] args) throws WrongArmPositionException, WrongHeadNodAngleException, WallIsAlreadyExistsException, SomeoneInOrchestraIsSickException, BecomeDeafException, SomeoneIsPlayingException, NotMovingArmsException, WallHeightException, WrongHeadAngleException {
    Locator locator = new Locator();
    locator.mainGeneratorOfPlace();
    ActionMaker actionMaker = new ActionMaker();
    actionMaker.starter();
}