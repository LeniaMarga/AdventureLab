import Players.NonMagical.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonMagicalTest {

    nonMagical nonMagical;
    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Bob", 5000, NonMagicalType.KNIGHT, WeaponType.AXE);
        dwarf = new Dwarf("Mike", 4500, NonMagicalType.DWARF, WeaponType.CLUB);
        barbarian = new Barbarian ("Barbara", 6000, NonMagicalType.BARBARIAN, WeaponType.SWORD);
    }


    @Test
    public void dwarfHasWeaponType(){
        assertEquals (WeaponType.CLUB, dwarf.getWeaponType ());
    }


    @Test
    public void dwarfHasWeaponValue(){
        assertEquals(900, dwarf.getWeaponValue ());
    }


    @Test
    public void knightSetWeapon(){
        knight.setWeaponType (WeaponType.SWORD);
        assertEquals (WeaponType.SWORD, knight.getWeaponType ());

    }

    @Test
    public void barbarianCanFight(){
        assertEquals ( "I will fight with the Axe",barbarian.fight("Axe"));
        assertEquals ( 6000, barbarian.lifeCount ());
    }

    @Test
    public void barbarianCanSetAttackPower(){
        assertEquals ( "I will fight with the Axe",barbarian.fight("Axe"));
        assertEquals ( 6000, barbarian.lifeCount ());
        assertEquals ( 6800,barbarian.setAttackPower (WeaponType.AXE));
    }


}
