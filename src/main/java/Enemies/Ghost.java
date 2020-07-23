package Enemies;

import Players.IAttack;
import Players.ITakeDamage;

public class Ghost extends Enemy implements ITakeDamage, IAttack {


    private int dmg;
    private int hp;

    public Ghost(String name){
        super(name);
        this.dmg = 2;
        this.hp = 10;

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
        return "Wooooooo!";
    }

    public String attack(ITakeDamage target){
        target.takeDamage(dmg);
        return "[clanking chains]";
    }
}
