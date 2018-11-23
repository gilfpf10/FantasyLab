package Players;

import Defence.Animal;
import Weapons.Weapon;

public class Wizard extends Player{

    private Weapon weapon;
    private Animal animal;

    public Wizard(String name, int healthValue, Weapon weapon, Animal animal) {
        super(name, healthValue);
        this.weapon = weapon;
        this.animal = animal;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAttackValue() {
        return this.weapon.getAttackValue();
    }

    public int getDefenceValue() {
        return this.animal.getDefenceValue();
    }

    public Animal getAnimal() {
        return animal;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }


    public void takeDamage(int damage) {
        if(this.getDefenceValue() < damage){
            this.setHealthValue(this.getHealthValue()-(damage - this.getDefenceValue()));

        }
    }
}

