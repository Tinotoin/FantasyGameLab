package MeleeTest;

import Pets.Blob;
import Players.Melee.Dwarf;
import Weapons.Axe;
import Weapons.IAmAWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Blob blob;
    IAmAWeapon weapon;
    Sword sword;
    Axe axe;

    @Before
    public void before(){
        sword = new Sword("Slicer");
        dwarf = new Dwarf("Bertram", sword);
        blob = new Blob("Blobert");
        axe = new Axe("Blap");
    }

    @Test
    public void testValues(){
        assertEquals("Bertram", dwarf.getName());
        assertEquals(sword, dwarf.getWeapon());
        assertEquals(1, dwarf.getAttackSpeed());
    }

    @Test
    public void testAttack(){
        dwarf.attack(blob);
        assertEquals(10, blob.getHp());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(axe);
        assertEquals(axe, dwarf.getWeapon());
    }
}
