
import Rooms.Room1;
import Rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class Room1Test {

    Room1 room;
    @Before
    public void setUp() throws Exception {
        room = new Room1("Emerald", Treasure.GEMS);
    }

    @Test
    public void canRemoveTreasure() {
        room.removeTreasure();
        assertNull(null, room.getTreasure());
    }
}
