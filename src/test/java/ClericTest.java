import Healing.Potion;
import Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;


    @Before
    public void before() {
        cleric = new Cleric("Cleric", 10, Potion.LARGEPOTION);

    }

    @Test
    public void getName() {
        assertEquals("Cleric", cleric.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(10, cleric.getHealthValue());

    }

    @Test
    public void getHealing() {
        assertEquals(15, cleric.getPotionValue());
    }

    @Test
    public void takeDamage() {
        cleric.takeDamage(10);
        assertEquals(15, cleric.getHealthValue());
    }


    @Test
    public void canSetPotion() {
        cleric.setPotion(Potion.SMALLPOTION);
        assertEquals(Potion.SMALLPOTION, cleric.getPotion());
    }

    @Test
    public void getPotion() {
        assertEquals(Potion.LARGEPOTION, cleric.getPotion());
    }
}
