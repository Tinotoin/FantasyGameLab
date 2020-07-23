package PetsTest;

import Pets.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

   Ogre ogre;
   Ogre ogre2;

    @Before
    public void before(){
        ogre = new Ogre("Sweaty Ogre");
        ogre2 = new Ogre("Barry");
    }

    @Test
    public void testValues(){
        assertEquals("Sweaty Ogre", ogre.getName());
        assertEquals(10, ogre.getDmg());
        assertEquals(50, ogre.getHp());
    }

    @Test
    public void canTakeDamage(){
        ogre.attack(ogre2);
        assertEquals(40, ogre2.getHp());
    }

}