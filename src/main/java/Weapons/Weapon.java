package Weapons;

public enum Weapon {

    AXE(5),
    SWORD(10),
    CLUB(2),
    FIREBALL(5),
    LIGHTNING(10);

    private final int attackValue;

    Weapon(int attackValue){
        this.attackValue = attackValue;

    }
        public int getAttackValue(){
        return attackValue;

        }
    }


