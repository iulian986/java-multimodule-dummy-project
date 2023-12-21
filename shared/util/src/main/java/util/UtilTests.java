package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UtilTests {

    @Test
    public void testJoin_WhenElementsProvided_ShouldReturnJoinedString() {
        // Arrange
        String[] elements = {"a", "b", "c"};

        // Act
        String result = Util.join(elements);

        // Assert
        assertThat(result).isEqualTo("a b c");
    }

    @Test
    public void testJoin_WhenNoElementsProvided_ShouldReturnEmptyString() {
        // Arrange

        // Act
        String result = Util.join();

        // Assert
        assertThat(result).isEmpty();
    }
}