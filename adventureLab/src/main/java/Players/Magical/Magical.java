package Players.Magical;

import Players.NonMagical.WeaponType;
import Players.Player;

public abstract class Magical extends Player {

    protected MagicalType magicalType;
    protected CreatureType creatureType;


    public Magical(String name, int healthValue, MagicalType magicalType, CreatureType creatureType) {
        super (name, healthValue);
        this.magicalType = magicalType;
        this.creatureType = creatureType;
    }

    public String getMagicalType() {
        return magicalType.getType();
    }

    public void setMagicalType(MagicalType magicalType) {

        this.magicalType = magicalType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public int getCreaturePower() {
        return creatureType.getPower ();
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public int setAttackPower(CreatureType creatureType){
        return creatureType.getPower ()+ healthValue;
    }

}
