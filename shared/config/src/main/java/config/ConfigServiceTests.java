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
        String expectedValue = "app";

        // Act
        String actualValue = configService.getConfig(key);

        // Assert
        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    public void testGetConfig_WhenKeyDoesNotExist_ThenReturnNull() {
        // Arrange
        String key = "nonExistentKey";

        // Act
        String actualValue = configService.getConfig(key);

        // Assert
        assertThat(actualValue).isNull();
    }
}