package Weapons;

public class Axe extends Weapon implements IAmAWeapon{

    private int dmg;
    private int weight;

    public Axe(String name) {
        super(name);
        this.dmg = 20;
        this.weight = 30;
    }

    public int getDmg() {
        return dmg;
    }

    public int getWeight() {
        return weight;
    }

}
