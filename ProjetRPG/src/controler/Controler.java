package controler;

import menu.Menu;
import character.Character;

public abstract class Controler {

    public abstract String NameChoice();

    public abstract Menu choice(Menu[] c);
    public abstract Menu choiceFight(Character pl,Character op);
    
}
