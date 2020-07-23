package WeaponsTest;

import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe("Destroyer");
    }

    @Test
    public void testValues(){
        assertEquals("Destroyer", axe.getName());
        assertEquals(20, axe.getDmg());
        assertEquals(30, axe.getWeight());
    }

}
