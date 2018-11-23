import Defence.DefenceWear;
import Players.Barbarian;
import Rooms.Room;
import Rooms.Room1;
import Rooms.Treasure;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class BarbarianTest {

    Barbarian barbarian;
    Room1 room;


    @Before
    public void before() {
        barbarian = new Barbarian("barbarian", 10, Weapon.AXE, DefenceWear.ARMOR);
        room = new Room1("Emerald", Treasure.MAGICBEANS);

    }

    @Test
    public void getName() {
        assertEquals("barbarian", barbarian.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(10, barbarian.getHealthValue());

    }

    @Test
    public void getAttack() {
        assertEquals(5, barbarian.getAttackValue());
    }

    @Test
    public void takeDamage() {
        barbarian.takeDamage(10);
        assertEquals(10, barbarian.getHealthValue());

    }
    @Test

    public void getDefenceWearValue(){
        assertEquals(15, barbarian.getDefenceWearValue());

    }

    @Test
    public void canSetWeapon() {
        barbarian.setWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

    @Test
    public void getWeapon() {
        assertEquals(Weapon.AXE, barbarian.getWeapon());
    }

    @Test
    public void getTreasure() {
        barbarian.setTreasure(Treasure.GOLD);
        assertEquals(0, barbarian.getTreasure().indexOf(Treasure.GOLD));


    }

    @Test
    public void canPickUpTreasure() {
        barbarian.pickUpTreasure(room);
        assertEquals(0, barbarian.getTreasure().indexOf(Treasure.MAGICBEANS));
        assertNull(room.getTreasure());
    }
}
