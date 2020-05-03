import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {


    @Test
    public void all_returnsAllInstancesOfSquad_true() throws Exception {
        Squad firstSquad = new Squad(34, "Jamal", "Cause1");
        Squad secondSquad = new Squad(44, "Hussein", "Cause2");
        assertTrue(Squad.all().contains(firstSquad));
        assertTrue(Squad.all().contains(secondSquad));
    }
    @Test
    public void getId_SquadInstantiateWithAnId_1() throws Exception {
        Squad.clear();
        Squad mySquad = new Squad(74, "Ahmed", "Weak");
        assertEquals(1, mySquad.getId());
    }
    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad Squad1 = new Squad(45, "John", "WK");
        assertEquals(true, Squad1 instanceof Squad);
    }
    @Test
    public void Squad_instantiatesWithName_String() {
        Squad Squad2 = new Squad(32,"STEVE", "WK");
        assertEquals("STEVE", Squad2.getName());
    }
    @Test
    public void Squad_instantiatesWithMaxSize_Integer() {
        Squad Squad3 = new Squad(45, "AST", "WK");
        assertEquals(45, Squad3.getMaxSize());
    }
    @Test
    public void Squad_instantiatesWithCause_String() {
        Squad Squad4 = new Squad(45, "ST", "WK");
        assertEquals("WK", Squad4.getCause());
    }
    @Test
    public void clear_emptiesAllAllSquadsFromArrayList_0() {
        Squad Squad5 = new Squad(23, "VS", "VW");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }


}