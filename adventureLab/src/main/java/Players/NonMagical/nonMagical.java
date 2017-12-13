package Players.NonMagical;

import Players.Player;

public abstract class nonMagical extends Player {

    protected NonMagicalType nonMagicalType;

    public nonMagical(String name, int healthValue, NonMagicalType nonMagicalType) {
        super (name, healthValue);
        this.nonMagicalType = nonMagicalType;
    }

    public NonMagicalType getNonMagicalType() {

        return nonMagicalType;
    }

    public void setNonMagicalType(NonMagicalType nonMagicalType) {

        this.nonMagicalType = nonMagicalType;
    }

    public int lifeCount(){
        return this.healthValue;
    }


}
