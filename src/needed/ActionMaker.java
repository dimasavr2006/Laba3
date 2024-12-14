package needed;

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


public class ActionMaker {

    public ActionMaker() throws WallIsAlreadyExistsException, WallHeightException, SomeoneInOrchestraIsSickException, SomeoneIsPlayingException {

        HeroesGenerator heroesGen = new HeroesGenerator();

        Margarita.visionList.add(heroesGen.frachniks[1]);
        Margarita.visionList.add(heroesGen.frachniks[2]);

        heroesGen.margarita.moveHero(Margarita.xCoord, Locator.npcConductorXCoordinate - Margarita.xCoord, Margarita.yCoord, Locator.npcConductorYCoordinate - Margarita.yCoord);

        Margarita.visionList.clear();

        //HIT BY MUSIC
        Margarita.visionList.add(heroesGen.begemot);
        Margarita.visionList.add(heroesGen.korovyev);

        OrchestraAll orchestraAll = new OrchestraAll();

        Margarita.visionList.add(orchestraAll.trumpetPartOfOrchestra);
        Margarita.visionList.add(orchestraAll.violinPartOfOrchestra);

        Conductor conductor = new Conductor(InstrumentType.NOINSTRUMENT);
        Margarita.visionList.add(conductor);
        conductor.makeStopPlaying();



    }
}
