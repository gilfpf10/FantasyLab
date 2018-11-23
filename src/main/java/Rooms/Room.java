package Rooms;

public abstract class Room {

    private String name;
    private Treasure treasure;

    public Room(String name, Treasure treasure) {
        this.name = name;
        this.treasure = treasure;
    }

    public Treasure removeTreasure(){
        Treasure TreasureRemoved = this.getTreasure();
        this.treasure = null;
        return TreasureRemoved;
    }

    public Treasure getTreasure() {
        return this.treasure;
    }
}
