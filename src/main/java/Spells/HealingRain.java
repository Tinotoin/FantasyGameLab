package Spells;

public class HealingRain extends Spell{

    private int spellDmg;
    private int spellCost;

    public HealingRain(String name) {
        super(name);
        this.spellDmg = -50;
        this.spellCost = 15;
    }

    public int getSpellDmg() {
        return spellDmg;
    }

    public int getSpellCost() {
        return spellCost;
    }
}
