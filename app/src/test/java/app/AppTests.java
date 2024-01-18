package app;

import config.ConfigService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppTests {

    @Test
    public void testGreet() {
        App app = new App();
        String name = "John";
        String result = app.greet(name);
        assertThat(result).isEqualTo("Hello John");
    }

    @Test
    public void testStore() {
        App app = new App();
        ConfigService cs = mock(ConfigService.class);
        when(cs.getConfig("datastore")).thenReturn("someConfigValue");
        boolean result = app.store("John");
        assertThat(result).isTrue();
        verify(cs, times(1)).getConfig("datastore");
        verifyNoMoreInteractions(cs);
    }
}