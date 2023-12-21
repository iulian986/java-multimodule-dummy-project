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
        // Arrange
        String key = "datastore";
        // Act
        String result = configService.getConfig(key);
        // Assert
        assertThat(result).isEqualTo("app");
    }

    @Test
    public void testGetConfig_WhenKeyDoesNotExist_ThenReturnNull() {
        // Arrange
        String key = "invalidKey";
        // Act
        String result = configService.getConfig(key);
        // Assert
        assertThat(result).isNull();
    }
}