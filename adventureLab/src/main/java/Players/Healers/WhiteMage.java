package Players.Healers;

import Players.Healers.IHeal;
import Players.Player;

public class WhiteMage extends Player implements IHeal {

    protected int portion;

    public WhiteMage(String name, int healthValue, int portion) {
        super (name, healthValue);
        this.portion = portion;
    }

    public String heal(String data) {

        return "Heal power: " + this.portion;
    }
}
