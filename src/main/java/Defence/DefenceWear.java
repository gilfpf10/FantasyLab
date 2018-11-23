package Defence;

public enum DefenceWear {

    CHAINMAIL(10),
    ARMOR(15),
    HELMET(5);

    private final int defenceWearValue;

    DefenceWear(int defenceWearValue){
        this.defenceWearValue = defenceWearValue;

    }
    public int getDefenceWearValue(){
        return defenceWearValue;

    }

}
