package needed.interfaces;

import exceptions.*;

public interface MakeToPlay {

    void makeToPlay(boolean isNeededToMoveArms) throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException, NotMovingArmsException;

}
