package Players.Melee;

import Players.Player;
import Weapons.Weapon;

public abstract class Melee extends Player {

    private Weapon weapon;

    public Melee(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

}
