package Players.Melee;
import java.lang.Math;
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
        double rand = Math.random();
        if (rand <= 0.1) {
            return "You missed, dobber";
        } else if (rand >= 0.9) {
            target.takeDamage(getWeapon().getDmg() * this.attackSpeed * 2);
            return "Eat my critical you git";
        } else {
            target.takeDamage(getWeapon().getDmg() * this.attackSpeed);
            return "Eat my attack you bastard";
        }

    }



}
