package app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppTests {

    @InjectMocks
    private App app;

    @Mock
    private ConfigService configService;

    @Test
    public void testGreet() {
        String name = "John";
        String result = app.greet(name);
        assertThat(result).isEqualTo("Hello John");
    }

    @Test
    public void testStore() {
        String name = "datastore";
        when(configService.getConfig(name)).thenReturn("someConfig");
        boolean result = app.store(name);
        assertThat(result).isTrue();
    }
}