package Rooms.Enemies;

import Players.Magical.CreatureType;
import Players.Magical.Magical;
import Players.NonMagical.WeaponType;
import Players.NonMagical.nonMagical;


public abstract class Enemy {

    private int attack;
    private int health;

    public Enemy( int attack, int health){
        this.attack = attack;
        this.health = health;
    }


    public int getAttack(int attack) {
        return this.attack;
    }

    public int getHealth(int health) {
        return this.health;
    }


    public String attackedByNonMagical(nonMagical nonMagical, WeaponType weaponType) {
        String result;
        if (this.health != 0) {
            int attackStrength = nonMagical.setAttackPower(weaponType);
            this.health -= weaponType.getValue ();
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
        if (this.health != 0) {
            int attackStrength = Magical.setAttackPower(creatureType);
            this.health -= creatureType.getPower ();
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
