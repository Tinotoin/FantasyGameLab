package Players.Mage;

import Pets.Pet;
import Players.ITakeDamage;
import Spells.IAmASpell;

public class Cleric extends Mage implements ICastSpell {

    public Cleric(String name, Pet pet, IAmASpell spell) {
        super(name, pet, spell);
    }

    public String castSpell(ITakeDamage target) {
        target.takeDamage(getSpell().getSpellDmg());
        return "Eat my restoration!";
    }
}
