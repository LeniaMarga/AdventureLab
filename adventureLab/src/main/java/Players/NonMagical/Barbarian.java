package Players.NonMagical;

public class Barbarian extends nonMagical implements IFight{

    protected WeaponType weaponType;

    public Barbarian(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType);
        this.weaponType = weaponType;
    }

    public void fight(int data){

    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponValue(){
        return weaponType.getValue ();
    }


}
