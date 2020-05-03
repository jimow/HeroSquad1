import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {


    @Test
    public void all_returnsAllInstancesOfHero_true() throws Exception {
        Hero firstHero = new Hero("Jamal", 20, "Very Strong", "Very Weak");
        Hero secondHero = new Hero("Hussein", 34, "Strong", "Weak");
        assertTrue(Hero.all().contains(firstHero));
        assertTrue(Hero.all().contains(secondHero));
    }
    @Test
    public void getId_heroInstantiateWithAnId_1() throws Exception {
        Hero.clear();
        Hero myHero = new Hero("Jamal", 34, "Strong", "Weak");
        assertEquals(1, myHero.getId());
    }
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero Hero1 = new Hero("Hassan", 45, "ST", "WK");
        assertEquals(true, Hero1 instanceof Hero);
    }
    @Test
    public void Hero_instantiatesWithName_String() {
        Hero Hero2 = new Hero("Hassan", 45, "ST", "WK");
        assertEquals("Hassan", Hero2.getName());
    }
    @Test
    public void Hero_instantiatesWithAge_Integer() {
        Hero Hero3 = new Hero("Hassan", 45, "ST", "WK");
        assertEquals(45, Hero3.getAge());
    }
    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero Hero4 = new Hero("Hassan", 45, "ST", "WK");
        assertEquals("WK", Hero4.getWeakness());
    }
    @Test
    public void clear_emptiesAllAllHerosFromArrayList_0() {
        Hero Hero5 = new Hero("XYX", 23, "VS", "VW");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }


}