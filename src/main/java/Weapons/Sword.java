package Weapons;

public class Sword extends Weapon{

    private int dmg;
    private int weight;

    public Sword(String name) {
        super(name);
        this.dmg = 10;
        this.weight = 20;
    }

    public int getDmg() {
        return dmg;
    }

    public int getWeight() {
        return weight;
    }
}
