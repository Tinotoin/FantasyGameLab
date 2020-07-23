package Players.Melee;

import Players.Player;
import Weapons.IAmAWeapon;
import Weapons.Weapon;

public abstract class Melee extends Player {

    private IAmAWeapon weapon;

    public Melee(String name, IAmAWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public IAmAWeapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(IAmAWeapon weapon) {
        this.weapon = weapon;
    }
}
