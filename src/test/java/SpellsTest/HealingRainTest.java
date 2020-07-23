package SpellsTest;

import Spells.HealingRain;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingRainTest {

    HealingRain healingRain;

    @Before
    public void before(){
        healingRain = new HealingRain("HealingRain");
    }

    @Test
    public void testValues(){
        assertEquals("HealingRain", healingRain.getName());
        assertEquals(-50, healingRain.getSpellDmg());
        assertEquals(15, healingRain.getSpellCost());
    }
}
