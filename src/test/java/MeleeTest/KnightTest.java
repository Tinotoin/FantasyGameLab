package MeleeTest;

import Pets.Blob;
import Players.Melee.Knight;
import Weapons.IAmAWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Blob blob;
    IAmAWeapon weapon;
    Sword sword;

    @Before
    public void before(){
        sword = new Sword("Slicer");
        knight = new Knight("Boris", sword);
        blob = new Blob("Blobert");
    }

    @Test
    public void testValues(){
        assertEquals("Boris", knight.getName());
        assertEquals(sword, knight.getWeapon());
        assertEquals(3, knight.getAttackSpeed());
    }

    @Test
    public void testAttack(){
        knight.attack(blob);
        assertEquals(-10, blob.getHp());
    }
}
