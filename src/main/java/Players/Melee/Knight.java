package Players.Melee;
import java.lang.Math;
import Players.IAttack;
import Players.ITakeDamage;
import Weapons.IAmAWeapon;
import Weapons.Weapon;

public class Knight extends Melee implements IAttack {

    private int attackSpeed;

    public Knight(String name, IAmAWeapon weapon) {
        super(name, weapon);
        this.attackSpeed = 3;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public String attack(ITakeDamage target) {
        double rand = Math.random();
        if (rand <= 0.1) {
            return "You missed, FOOL";
        } else if (rand >= 0.9) {
            target.takeDamage(getWeapon().getDmg() * this.attackSpeed * 2);
            return "Eat my critical you twat";
        } else {
            target.takeDamage(getWeapon().getDmg() * this.attackSpeed);
            return "Eat my regular attack you bad man";
        }

    }

}