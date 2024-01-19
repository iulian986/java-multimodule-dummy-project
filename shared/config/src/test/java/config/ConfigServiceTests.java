package config;

import org.apache.commons.configuration2.CompositeConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConfigServiceTests {

    @InjectMocks
    private ConfigService configService;

    @Mock
    private CompositeConfiguration mockConfigs;

    @Test
    public void testGetConfig_WhenKeyExists_ThenReturnConfigValue() {
        String key = "datastore";
        String expectedValue = "app";
        when(mockConfigs.getString(key)).thenReturn(expectedValue);

        String actualValue = configService.getConfig(key);

        assertThat(actualValue).isEqualTo(expectedValue);
    }
}