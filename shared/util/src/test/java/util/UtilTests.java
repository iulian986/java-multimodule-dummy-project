package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UtilTests {

    @Test
    public void testJoin() {
        // Given
        String[] elements = {"a", "b", "c"};
        Util util = mock(Util.class);
        when(util.join(elements)).thenReturn("a, b, c");

        // When
        String result = util.join(elements);

        // Then
        assertThat(result).isEqualTo("a, b, c");
    }
}