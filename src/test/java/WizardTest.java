import Defence.Animal;
import Players.Wizard;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;


    @Before
    public void before() {
        wizard = new Wizard("Wizard", 10, Weapon.FIREBALL, Animal.DRAGON);

    }

    @Test
    public void getName() {
        assertEquals("Wizard", wizard.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(10, wizard.getHealthValue());

    }

    @Test
    public void getAttack() {
        assertEquals(5, wizard.getAttackValue());
    }

    @Test
    public void takeDamage() {
        wizard.takeDamage(10);
        assertEquals(10, wizard.getHealthValue());

    }
    @Test

    public void getAnimalDefenceValue(){
        assertEquals(10, wizard.getDefenceValue());

    }

    @Test
    public void canSetWeapon() {
        wizard.setWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, wizard.getWeapon());
    }

    @Test
    public void getWeapon() {
        assertEquals(Weapon.FIREBALL, wizard.getWeapon());
    }
}
