package Players.Melee;

import Players.IAttack;
import Players.ITakeDamage;
import Weapons.IAmAWeapon;
import Weapons.Weapon;

public class Dwarf extends Melee implements IAttack {

    private int attackSpeed;

    public Dwarf(String name, IAmAWeapon weapon) {
        super(name, weapon);
        this.attackSpeed = 1;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public String attack(ITakeDamage target) {
        target.takeDamage(getWeapon().getDmg() * this.attackSpeed);
        return "Take this ya dobber";
    }



}
