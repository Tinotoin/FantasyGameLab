package Players.Mage;

import Pets.Pet;
import Players.Player;
import Spells.IAmASpell;

public abstract class Mage extends Player {

    private int mana;
    private Pet pet;
    private IAmASpell spell;

    public Mage(String name, Pet pet, IAmASpell spell) {
        super(name);
        this.mana = 40;
        this.pet = pet;
        this.spell = spell;
    }

    public int getMana() {
        return mana;
    }

    public Pet getPet() {
        return pet;
    }

    public IAmASpell getSpell() {
        return spell;
    }
}
