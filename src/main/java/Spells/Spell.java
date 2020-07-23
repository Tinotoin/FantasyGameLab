package Spells;

public abstract class Spell {

    private String name;

    public Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
