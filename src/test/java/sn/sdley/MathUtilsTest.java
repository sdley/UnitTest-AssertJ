package sn.sdley;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class MathUtilsTest {

    /** -----------------------------------------
     * ✅ TESTS DE MathUtils (Exercice 4)
     * -----------------------------------------
     */

    @Test
    @DisplayName("Division normale")
    void shouldReturnCorrectDivisionResult() {
        // Act
        int result = MathUtils.divide(4, 2);

        // Assert
        assertThat(result)
                .as("La méthode divide(4, 2) doit retourner 2")
                .isEqualTo(2);
    }

    @Test
    @DisplayName("Division par zéro")
    void shouldThrowExceptionWhenDividingByZero() {
        // Assert & Act
        assertThatThrownBy(() -> MathUtils.divide(4, 0))
                .as("La méthode divide(4, 0) doit lever une IllegalArgumentException")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Division par zéro !");
    }
}
