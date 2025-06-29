import org.junit.jupiter.api.*;

public class AAATest {
    String testName;

    @BeforeEach
    void initialize() {
        testName = "Test";
    }

    @AfterEach
    void cleanup() {
        testName = null;
    }

    @Test
    void verifyNameLength() {
        Assertions.assertEquals(4, testName.length());
    }
}
