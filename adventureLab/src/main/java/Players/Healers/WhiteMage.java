package Players.Healers;

import Players.Healers.IHeal;
import Players.Player;

public class WhiteMage extends Player implements IHeal {

    protected int healportion;

    public WhiteMage(String name, int healthValue, int healportion) {
        super (name, healthValue);
        this.healportion = healportion;
    }


    public String heal(String data) {
        return null;
    }
}
