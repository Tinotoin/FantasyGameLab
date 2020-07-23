package Spells;

public class LightningBolt extends Spell implements IAmASpell{

    private int spellDmg;
    private int spellCost;

    public LightningBolt(String name) {
        super(name);
        this.spellDmg = 15;
        this.spellCost = 10;
    }

    public int getSpellDmg() {
        return spellDmg;
    }

    public int getSpellCost() {
        return spellCost;
    }
}