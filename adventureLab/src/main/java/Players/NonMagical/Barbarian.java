package Players.NonMagical;

public class Barbarian extends nonMagical implements IFight{


    public Barbarian(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType, weaponType);
    }

    public String fight(String weaponName){
        return "I will fight with the " + weaponName;
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
