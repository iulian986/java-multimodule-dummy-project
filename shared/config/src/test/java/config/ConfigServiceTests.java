package config;

import org.apache.commons.configuration2.CompositeConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConfigServiceTests {

    private ConfigService configService;

    @Mock
    private CompositeConfiguration configs;

    @Test
    public void testGetConfig() {
        configService = new ConfigService();
        configService.setConfigs(configs);

        // Given
        String key = "datastore";
        lenient().when(configs.getString(key)).thenReturn("app");

        // When
        String result = configService.getConfig(key);

        // Then
        assertThat(result).isEqualTo("app");
    }
}