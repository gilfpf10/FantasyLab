package Healing;

public enum Potion {
    SMALLPOTION(5),
    MEDIUMPOTION(10),
    LARGEPOTION(15);

    private final int healingValue;

    Potion(int healingValue) {
        this.healingValue = healingValue;

    }

    public int getHealingValue() {
        return healingValue;

    }
}
