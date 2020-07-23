package Spells;

public class Fireball extends Spell{

        private int spellDmg;
        private int spellCost;

    public Fireball(String name) {
        super(name);
        this.spellDmg = 20;
        this.spellCost = 2;
    }

    public int getSpellDmg() {
        return spellDmg;
    }

    public int getSpellCost() {
        return spellCost;
    }
}
