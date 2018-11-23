package Players;

import Rooms.Room;
import Rooms.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int healthValue;
    private ArrayList<Treasure> treasureList;

    public Player(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.treasureList = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasureList;
    }
//
//    public void setTreasure(ArrayList<Treasure> treasure) {
//        this.treasure = treasure;
//    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


    public void setTreasure(Treasure treasure) {
        this.treasureList.add(treasure);
    }

    public void pickUpTreasure(Room room){

        this.setTreasure(room.removeTreasure());
    }
}
