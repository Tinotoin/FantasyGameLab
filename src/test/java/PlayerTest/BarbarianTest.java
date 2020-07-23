package PlayerTest;

import Creatures.Blob;
import Creatures.Ogre;
import Players.Melee.Barbarian;
import Weapons.Axe;
import Weapons.IAmAWeapon;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Ogre ogre;
    IAmAWeapon weapon;
    Axe axe;

    @Before
    public void before(){
        axe = new Axe("Hacker");
        barbarian = new Barbarian("Bertie", axe);
        ogre = new Ogre("Ogreman");
    }

    @Test
    public void testValues(){
        assertEquals("Bertie", barbarian.getName());
        assertEquals(axe, barbarian.getWeapon());
        assertEquals(2, barbarian.getAttackSpeed());
    }

    @Test
    public void testAttack(){
        barbarian.attack(ogre);
        assertEquals(10, ogre.getHp());
    }
}