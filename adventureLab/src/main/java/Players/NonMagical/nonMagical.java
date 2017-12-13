package Players.NonMagical;

import Players.Player;

public abstract class nonMagical extends Player {

    protected NonMagicalType nonMagicalType;
    protected WeaponType weaponType;

    public nonMagical(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue);
        this.nonMagicalType = nonMagicalType;
        this.weaponType = weaponType;
    }

    public String getNonMagicalType() {

        return nonMagicalType.getType ();
    }

    public void setNonMagicalType(NonMagicalType nonMagicalType) {

        this.nonMagicalType = nonMagicalType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getWeaponValue(){
        return weaponType.getValue ();
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int setAttackPower(WeaponType weaponType){
        return weaponType.getValue ()+ healthValue;
    }


}
