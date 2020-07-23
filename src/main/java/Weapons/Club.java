package Weapons;

public class Club extends Weapon{

    private int dmg;
    private int weight;

    public Club(String name) {
        super(name);
        this.dmg = 30;
        this.weight = 50;
    }

    public int getDmg() {
        return dmg;
    }

    public int getWeight() {
        return weight;
    }
}
