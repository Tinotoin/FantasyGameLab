package MageTest;

import Pets.Blob;
import Pets.Ogre;
import Players.Mage.Wizard;
import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fireball fireball;
    Ogre ogre;
    Blob blob;

    @Before
    public void before(){
        blob = new Blob("Ryan");
        ogre = new Ogre("Winston");
        fireball = new Fireball("Fireball");
        wizard = new Wizard("Dean", blob, fireball);
    }

    @Test
    public void testValues(){
        assertEquals("Dean", wizard.getName());
        assertEquals(blob, wizard.getPet());
        assertEquals(fireball, wizard.getSpell());
        assertEquals(40, wizard.getMana());
    }

    @Test
    public void canAttack(){
        wizard.castSpell(ogre);
        assertEquals(30, ogre.getHp());
    }

}
