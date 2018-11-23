package Players;

import Defence.DefenceWear;
import Weapons.Weapon;

public class Dwarf extends Player {
    private Enum weapon;
    private Enum defenceWear;

    public Dwarf(String name, int healthValue, Enum<Weapon> weapon, Enum<DefenceWear> defenceWear) {
        super(name, healthValue);
        this.weapon = weapon;
        this.defenceWear = defenceWear;
    }
}
