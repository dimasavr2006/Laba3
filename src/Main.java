import environment.heroes.*;
import environment.*;
import environment.orchestra.*;
import environment.fakeEnvironment.*;
import enums.*;
import exceptions.*;
import location.*;
import needed.*;
import needed.interfaces.*;
import needed.utils.*;

public class Main {
    public static void main(String[] args) throws WrongArmPositionException, WrongHeadNodAngleException, WallIsAlreadyExistsException, SomeoneInOrchestraIsSickException, BecomeDeafException, SomeoneIsPlayingException, NotMovingArmsException, WallHeightException, WrongHeadAngleException {
        Locator locator = new Locator();
        ActionMaker actionMaker = new ActionMaker();
    }
}