import Players.Magical.CreatureType;
import Players.Magical.MagicalType;
import Players.Magical.Warlock;

import Players.Magical.Witch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalTest {
    Players.Magical.Magical Magical;
    Warlock warlock;
    Witch witch;


    @Before
    public void before(){
        warlock = new Warlock ("Tom", 6000, MagicalType.WARLOCK, CreatureType.DRAGON);
        witch = new Witch ("Jenny", 4500, MagicalType.WITCH, CreatureType.DRAGON);
    }


    @Test
    public void warlockHasCreatureType(){
        assertEquals (CreatureType.DRAGON, warlock.getCreatureType ());
    }


    @Test
    public void warlockHasCreaturePower(){
        assertEquals(2000, warlock.getCreaturePower ());
    }


    @Test
    public void witchSetCreature(){
        witch.setCreatureType (CreatureType.OGRE);
        assertEquals (CreatureType.OGRE, witch.getCreatureType ());

    }

    @Test
    public void witchCanCastSpell(){
        assertEquals ( "Dragon I call you!",witch.cast("Dragon"));
    }

    @Test
    public void witchCanSetAttackPower(){
        assertEquals ( 4500, witch.lifeCount ());
        assertEquals ( 6500,witch.setAttackPower (CreatureType.DRAGON));
    }

}
