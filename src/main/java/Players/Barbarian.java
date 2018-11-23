package Players;

import Weapons.Weapon;
import Defence.DefenceWear;

public class Barbarian extends Player {
    private Weapon weapon;
    private DefenceWear defenceWear;

    public Barbarian(String name, int healthValue, Weapon weapon, DefenceWear defenceWear) {
        super(name, healthValue);
        this.weapon = weapon;
        this.defenceWear = defenceWear;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAttackValue() {
        return this.weapon.getAttackValue();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public int getDefenceWearValue() {
        return this.defenceWear.getDefenceWearValue();
    }


    public void takeDamage(int damage) {
        if(this.getDefenceWearValue ()< damage){
            this.setHealthValue(this.getHealthValue()-(damage - this.getDefenceWearValue()));

        }
    }



}