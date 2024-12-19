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
import needed.utils.*;

public class SomeoneInOrchestraIsSickException extends Exception {

    private String message;

    public SomeoneInOrchestraIsSickException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        System.out.println("АПЧХИ!");
        return message;
    }
}
