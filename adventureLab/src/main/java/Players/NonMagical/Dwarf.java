package Players.NonMagical;

public class Dwarf extends nonMagical implements IFight {

    protected WeaponType weaponType;

    public Dwarf(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType);
        this.weaponType = weaponType;
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


    public void fight(int data) {
         getWeaponValue();
    }


//
//    public String attack(Kaiju kaiju) {
//        String result;
//        if (this.type.type != "Destroyed") {
//            this.setrandomAttackStrength();
//            int attackPower = kaiju.getHealthValue() - (this.initialAttackValue * this.getAttackStrength().strength);
//            kaiju.setHealthValue(attackPower);
//            if (kaiju.getHealthValue() <= 0) {
//                result = kaiju.getName() + " has been destroyed. \n Game Over!";
//            } else {
//                result = this.getFullDescription() + " " + this.getAttackStrength().description + " " + kaiju.getName()
//                        + " for " + (initialAttackValue * getAttackStrength().strength) + " points of damage";
//            }
//        }
//        else{
//            result = this.getFullDescription() + " cannot attack";
//        }
//        return result;
//    }

}
