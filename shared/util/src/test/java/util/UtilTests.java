package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UtilTests {

    @Test
    public void testJoin() {
        // Given
        String[] elements = {"a", "b", "c"};

        // When
        String result = Util.join(elements);

        // Then
        assertThat(result).isEqualTo("a,b,c");
    }
}