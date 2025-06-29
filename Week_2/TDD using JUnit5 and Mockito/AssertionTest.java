import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyAssertionsTest {
    @Test
    void test() {
        assertEquals(4, 2 + 2);
        assertTrue("Java".contains("J"));
        assertNotNull("JUnit");
    }
}
