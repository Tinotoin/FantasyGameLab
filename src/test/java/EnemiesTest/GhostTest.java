package EnemiesTest;

import Enemies.Ghost;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostTest {

    Ghost ghost;
    Ghost ghost2;

    @Before
    public void before(){
        ghost = new Ghost("Sweaty Ghost");
        ghost2 = new Ghost("Barry");
    }

    @Test
    public void testValues(){
        assertEquals("Sweaty Ghost", ghost.getName());
        assertEquals(2, ghost.getDmg());
        assertEquals(10, ghost.getHp());
    }

    @Test
    public void canTakeDamage(){
        ghost.attack(ghost2);
        assertEquals(8, ghost2.getHp());
    }

}