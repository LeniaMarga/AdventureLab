import Players.Healers.WhiteMage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    WhiteMage whitemage;

    @Before
    public void before(){
        whitemage = new WhiteMage ("Danny", 5000, 1000);
    }

    @Test
    public  void canHeal(){
        assertEquals( "Heal power: 1000", whitemage.heal ("heal"));
    }
}
