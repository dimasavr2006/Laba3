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
import needed.parts.*;
import needed.utils.*;

public interface MakeToPlay {

    public void makeToPlay() throws SomeoneIsPlayingException, SomeoneInOrchestraIsSickException;

}
