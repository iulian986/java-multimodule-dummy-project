package config;

import org.apache.commons.configuration2.CompositeConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConfigServiceTests {

    @Mock
    private CompositeConfiguration compositeConfiguration;

    @InjectMocks
    private ConfigService configService;

    @BeforeEach
    public void setup() {
        configService = new ConfigService();
    }

    @Test
    public void testGetConfig() {
        // Arrange
        String key = "datastore";
        when(compositeConfiguration.getString(key)).thenReturn("app");

        // Act
        String result = configService.getConfig(key);

        // Assert
        assertThat(result).isEqualTo("app");
    }
}