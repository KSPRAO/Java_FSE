import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class Payment {
    void makePayment(String userId, int amount) {}
}

public class VerifyTest {
    @Test
    void testInteraction() {
        Payment mockPayment = mock(Payment.class);
        mockPayment.makePayment("U1", 100);
        verify(mockPayment).makePayment("U1", 100);
    }
}
