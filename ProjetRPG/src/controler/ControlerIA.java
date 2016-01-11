package controler;

import action.Action;

public class ControlerIA extends Controler {

    public ControlerIA(Action action) {
        this.action = action;
    }
    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
