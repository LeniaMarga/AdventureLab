package Players.Magical;

import Players.Player;

public abstract class Magical extends Player {

    protected MagicalType magicalType;

    public Magical(String name, int healthValue, MagicalType magicalType) {
        super (name, healthValue);
        this.magicalType = magicalType;
    }

    public MagicalType getMagicalType() {
        return magicalType;
    }

    public void setMagicalType(MagicalType magicalType) {
        this.magicalType = magicalType;
    }


}
