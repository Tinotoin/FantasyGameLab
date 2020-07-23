package SpellsTest;

import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;

    @Before
    public void before(){
        fireball = new Fireball("Fireball");
    }

    @Test
    public void testValues(){
        assertEquals("Fireball", fireball.getName());
        assertEquals(20, fireball.getSpellDmg());
        assertEquals(2, fireball.getSpellCost());
    }
}
