package WeaponsTest;

import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword("Slicer");
    }

    @Test
    public void testValues(){
        assertEquals("Slicer", sword.getName());
        assertEquals(10, sword.getDmg());
        assertEquals(20, sword.getWeight());
    }

}