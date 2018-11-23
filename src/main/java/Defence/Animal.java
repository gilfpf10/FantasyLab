package Defence;

public enum Animal {

    DRAGON(10),
    UNICORN(5),
    FIREBIRD(15);

    private final int defenceValue;


    Animal(int defenceValue) {
        this.defenceValue = defenceValue;

    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
