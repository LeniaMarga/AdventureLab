package Players.NonMagical;

public class Dwarf extends nonMagical implements IFight {


    public Dwarf(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType, weaponType);
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

    public int lifeCount(){
        return this.healthValue;
    }


    public String fight(String weaponName){
        return "I will destroy with the " + weaponName;
    }



}
