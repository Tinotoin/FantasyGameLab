package SpellsTest;

import Spells.Fireball;
import Spells.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningBoltTest {

    LightningBolt lightningBolt;

    @Before
    public void before(){
        lightningBolt = new LightningBolt("LightningBolt");
    }

    @Test
    public void testValues(){
        assertEquals("LightningBolt", lightningBolt.getName());
        assertEquals(15, lightningBolt.getSpellDmg());
        assertEquals(10, lightningBolt.getSpellCost());
    }
}
