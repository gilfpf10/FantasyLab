package Players;

import Healing.Potion;

public class Cleric extends Player {

    private Potion potion;

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public Cleric(String name, int healthValue, Potion potion) {
        super(name, healthValue);
        this.potion = potion;
    }

    public int getPotionValue() {
        return this.potion.getHealingValue();
    }

    public void takeDamage(int damage) {
            this.setHealthValue(this.getHealthValue()-(damage - this.getPotionValue()));

        }
}
