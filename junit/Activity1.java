import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list;
    @BeforeEach
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }


    @Test
    public void insertTest() {
        // Assertion for size
        assertEquals(2, list.size(), "Wrong size");
        // Add new element
        list.add(2, "charlie");
        // Assert with new elements
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }

    // Test method to test the replace operation
    @Test
    public void replaceTest() {
        // Replace new element
        list.set(1, "charlie");

        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}