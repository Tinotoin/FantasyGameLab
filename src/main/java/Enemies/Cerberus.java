package Enemies;

import Players.IAttack;
import Players.ITakeDamage;

public class Cerberus extends Enemy implements ITakeDamage, IAttack {


    private int dmg;
    private int hp;

    public Cerberus(String name){
        super(name);
        this.dmg = 20;
        this.hp = 100;

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
        return "Awoooooooo!";
    }

    public String attack(ITakeDamage target){
        target.takeDamage(dmg);
        return "[foams at mouth]";
    }
}
