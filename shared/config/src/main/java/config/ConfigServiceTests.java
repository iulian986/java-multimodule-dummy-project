package config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConfigServiceTests {

    @InjectMocks
    private ConfigService configService;

    @BeforeEach
    public void setup() {
        configService = new ConfigService();
    }

    @Test
    public void testGetConfig_WhenKeyExists_ThenReturnConfigValue() {
        String key = "datastore";
        String expectedValue = "app";
        String actualValue = configService.getConfig(key);
        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    public void testGetConfig_WhenKeyDoesNotExist_ThenReturnNull() {
        String key = "invalidKey";
        String actualValue = configService.getConfig(key);
        assertThat(actualValue).isNull();
    }
}