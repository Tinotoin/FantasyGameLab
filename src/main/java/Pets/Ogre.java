package Pets;

import Players.IAttack;
import Players.ITakeDamage;

public class Ogre extends Pet implements ITakeDamage, IAttack {

    private int dmg;
    private int hp;

    public Ogre(String name) {
        super(name);
        this.dmg = 10;
        this.hp = 50;
    }

    public int getDmg() {
        return dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String takeDamage(int damage){
        hp = hp - damage;
        return "Ah ya bastard!";
    }

    public String attack(ITakeDamage target){
        target.takeDamage(dmg);
        return "Take that ya bawbag!";
    }
}
