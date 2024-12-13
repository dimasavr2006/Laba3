package exceptions;

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

public class SomeoneInOrchestraIsSickException extends Exception {
    public SomeoneInOrchestraIsSickException(String message) {
        super(message);
    }
}
