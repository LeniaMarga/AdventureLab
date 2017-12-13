package Players;

import Players.Magical.CreatureType;
import Players.Magical.Magical;
import Players.NonMagical.WeaponType;
import Players.NonMagical.nonMagical;

public abstract class Player {

    public String name;
    public int healthValue;

    public Player(String name, int healthValue){
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


    public int lifeCount(){
        return this.healthValue;
    }



    public String attackAsNonMagical(nonMagical nonMagical, WeaponType weaponType) {
        String result;
        if (this.healthValue != 0) {
            nonMagical.setAttackPower(weaponType);
            this.healthValue += weaponType.getValue ();
            if (nonMagical.lifeCount() <= 0) {
                result = nonMagical.getName() + " has been destroyed. \n Game Over!";
            } else {
                result = nonMagical.getName()+" the " + nonMagical.getNonMagicalType ()+ " " + attackStrength + " caused "
                        + weaponType.getValue () + " points of damage";
            }
        }
        else{
            result =  "cannot attack";
        }
        return result;
    }



    public String attackedByNonMagical(nonMagical nonMagical, WeaponType weaponType) {
        String result;
        if (this.healthValue != 0) {
            int attackStrength = nonMagical.setAttackPower(weaponType);
            this.healthValue -= weaponType.getValue ();
            if (nonMagical.lifeCount() <= 0) {
                result = nonMagical.getName() + " has been destroyed. \n Game Over!";
            } else {
                result = nonMagical.getName()+" the " + nonMagical.getNonMagicalType ()+ " " + attackStrength + " caused "
                        + weaponType.getValue () + " points of damage";
            }
        }
        else{
            result =  "cannot attack";
        }
        return result;
    }


    public String attackedByMagical(Magical Magical, CreatureType creatureType) {
        String result;
        if (this.healthValue != 0) {
            int attackStrength = Magical.setAttackPower(creatureType);
            this.healthValue -= creatureType.getPower ();
            if (Magical.lifeCount() <= 0) {
                result = Magical.getName() + " has been destroyed. \n Game Over!";
            } else {
                result = Magical.getName()+" the " + Magical.getMagicalType ()+ " " + attackStrength + " caused "
                        + creatureType.getPower () + " points of damage";
            }
        }
        else{
            result =  "cannot attack";
        }
        return result;
    }

}
