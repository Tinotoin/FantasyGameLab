package MageTest;

import Pets.Blob;
import Pets.Ogre;
import Players.Mage.Warlock;
import Spells.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    LightningBolt lightningBolt;
    Ogre ogre;
    Blob blob;

    @Before
    public void before(){
        blob = new Blob("Ryan");
        ogre = new Ogre("Winston");
        lightningBolt = new LightningBolt("LightningBolt");
        warlock = new Warlock("Dean", blob, lightningBolt);
    }

    @Test
    public void testValues(){
        assertEquals("Dean", warlock.getName());
        assertEquals(blob, warlock.getPet());
        assertEquals(lightningBolt, warlock.getSpell());
        assertEquals(40, warlock.getMana());
    }

    @Test
    public void canAttack(){
        warlock.castSpell(ogre);
        assertEquals(20, ogre.getHp());
        assertEquals(90, warlock.getHp());
    }

}
