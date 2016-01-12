package controler;

import action.Action;

public class ControlerIA extends Controler {
    private Action action;
    
    
    @Override
    public int choix(){
        return 1;
    }
    
    public ControlerIA(Action action) {
        this.action = action;
    }
    

    public ControlerIA() {
        
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
