package MageTest;

import Pets.Blob;
import Pets.Ogre;
import Players.Mage.Cleric;
import Spells.HealingRain;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingRain healingRain;
    Ogre ogre;
    Blob blob;

    @Before
    public void before(){
        blob = new Blob("Ryan");
        ogre = new Ogre("Winston");
        healingRain = new HealingRain("HealingRain");
        cleric = new Cleric("Dean", blob, healingRain);
    }

    @Test
    public void testValues(){
        assertEquals("Dean", cleric.getName());
        assertEquals(blob, cleric.getPet());
        assertEquals(healingRain, cleric.getSpell());
        assertEquals(40, cleric.getMana());
    }

    @Test
    public void canAttack(){
        cleric.castSpell(ogre);
        assertEquals(100, ogre.getHp());
    }

}
