package needed.interfaces;

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

public interface MakeToPlay {

    public void makeToPlay(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException, NotMovingArmsException;

}
