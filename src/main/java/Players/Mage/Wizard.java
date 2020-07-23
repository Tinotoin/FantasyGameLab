package Players.Mage;

import Pets.Pet;
import Players.ITakeDamage;
import Spells.IAmASpell;

public class Wizard extends Mage implements ICastSpell{

    public Wizard(String name, Pet pet, IAmASpell spell) {
        super(name, pet, spell);
    }

    public String castSpell(ITakeDamage target) {
        target.takeDamage(getSpell().getSpellDmg());
        return "Eat my flames clunto!";
    }

}
