package Players.Mage;

import Pets.Pet;
import Players.ITakeDamage;
import Spells.IAmASpell;

public class Warlock extends Mage implements ICastSpell{

    public Warlock(String name, Pet pet, IAmASpell spell) {
        super(name, pet, spell);
    }

    public String castSpell(ITakeDamage target) {
        target.takeDamage(getSpell().getSpellDmg() * 2 );
        takeDamage(10);
        return "Eat my flames ya goon!";
    }

}
