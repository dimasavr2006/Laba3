package environment.orchestra;

import exceptions.DuplicateNameInOrchestraException;
import exceptions.SomeoneInOrchestraIsSickException;

import java.util.ArrayList;

public class OrchestraAll {

    public ViolinPartOfOrchestra violinPartOfOrchestra;
    public TrumpetPartOfOrchestra trumpetPartOfOrchestra;

    public OrchestraAll() throws SomeoneInOrchestraIsSickException {

        this.violinPartOfOrchestra = new ViolinPartOfOrchestra();
        this.trumpetPartOfOrchestra = new TrumpetPartOfOrchestra();

        checkNames(violinPartOfOrchestra, trumpetPartOfOrchestra);

    }

    public Musician getIJMusician(Musician[][] musicians, int itoe, int jitoe) {

        return musicians[itoe][jitoe];

    }

    private void checkNames(ViolinPartOfOrchestra violinPartOfOrchestra, TrumpetPartOfOrchestra trumpetPartOfOrchestra) {
        ArrayList<String> namesViolin = new ArrayList<>();
        ArrayList<String> namesTrumpet = new ArrayList<>();

        for (int i = 0; i < violinPartOfOrchestra.violinsAll.length; i++) {
            for (int j = 0; j < violinPartOfOrchestra.violinsAll[i].length; j++){
                namesViolin.add(violinPartOfOrchestra.violinsAll[i][j].getName());
            }
        }

        namesViolinChecker(namesViolin);

        for (int i = 0; i < trumpetPartOfOrchestra.trumpetsAll.length; i++) {
            for (int j = 0; j < trumpetPartOfOrchestra.trumpetsAll[i].length; j++){
                namesTrumpet.add(trumpetPartOfOrchestra.trumpetsAll[i][j].getName());
            }
        }

        namesViolinChecker(namesTrumpet);

        for (String s1 : namesViolin) {
            for (String s2 : namesTrumpet) {
                if (s1.equals(s2)) {
                    throw new DuplicateNameInOrchestraException("2");
                }
            }
        }

    }

    private void namesViolinChecker(ArrayList<String> name) {
        for (int i = 0; i < name.size(); i++) {
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) {
                    throw new DuplicateNameInOrchestraException("1");
                }
            }
        }
    }

}

