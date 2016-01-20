package controler;

import menu.Menu;
import character.Character;
import item.Item;
import java.util.List;

public abstract class Controler {

    public abstract String NameChoice();

    public abstract Menu choice(Menu[] c);
    public abstract Menu choiceFight(Character pl,Character op);
    public abstract Item choiceInventory(List<Item> arrayItem);
    
}
