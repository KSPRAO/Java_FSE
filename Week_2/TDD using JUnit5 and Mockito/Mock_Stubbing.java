import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class API {
    String fetchData() {
        return "real";
    }
}

class Service {
    API apiRef;

    Service(API api) {
        this.apiRef = api;
    }

    String execute() {
        return "From " + apiRef.fetchData();
    }
}

public class MockTest {
    @Test
    void testMocking() {
        API mockedApi = mock(API.class);
        when(mockedApi.fetchData()).thenReturn("mocked");
        Service service = new Service(mockedApi);
        assert service.execute().equals("From mocked");
    }
}
