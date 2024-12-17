package environment.orchestra;

import enums.*;
import exceptions.SomeoneInOrchestraIsSickException;
import location.*;
import needed.Human;

public class OrchestraAll {

    public ViolinPartOfOrchestra violinPartOfOrchestra;
    public TrumpetPartOfOrchestra trumpetPartOfOrchestra;

    public OrchestraAll() throws SomeoneInOrchestraIsSickException {

        this.violinPartOfOrchestra = new ViolinPartOfOrchestra();
        this.trumpetPartOfOrchestra = new TrumpetPartOfOrchestra();

    }

    public ViolinPartOfOrchestra getViolinPartOfOrchestra() {
        return violinPartOfOrchestra;
    }
    public TrumpetPartOfOrchestra getTrumpetPartOfOrchestra() {
        return trumpetPartOfOrchestra;
    }

    public Musician getIJMusician(Musician[][] musicians, int itoe, int jitoe) {

        return musicians[itoe][jitoe];

    }

}

