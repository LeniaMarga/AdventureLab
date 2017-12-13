package Players.NonMagical;

import Players.Player;

public class Knight extends nonMagical implements IFight {


    public Knight(String name, int healthValue, NonMagicalType nonMagicalType, WeaponType weaponType) {
        super (name, healthValue, nonMagicalType, weaponType);

    }

    public String fight(Player player){

        return "Attack" + player.getName();
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
