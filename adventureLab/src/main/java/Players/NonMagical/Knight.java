package Players.NonMagical;

public class Knight extends nonMagical implements IFight {

    protected WeaponType weaponType;

    public Knight(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType);
        this.weaponType = weaponType;
    }

    public String fight(String data) {
        return null;
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


}
