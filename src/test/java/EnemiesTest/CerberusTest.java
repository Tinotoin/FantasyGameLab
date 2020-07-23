package EnemiesTest;

import Enemies.Cerberus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CerberusTest {

    Cerberus cerberus;
    Cerberus cerberus2;

    @Before
    public void before(){
        cerberus = new Cerberus("Sweaty Cerberus");
        cerberus2 = new Cerberus("Barry");
    }

    @Test
    public void testValues(){
        assertEquals("Sweaty Cerberus", cerberus.getName());
        assertEquals(20, cerberus.getDmg());
        assertEquals(100, cerberus.getHp());
    }

    @Test
    public void canTakeDamage(){
        cerberus.attack(cerberus2);
        assertEquals(80, cerberus2.getHp());
    }

}