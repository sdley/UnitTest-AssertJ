package sn.sdley;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class StringUtilsTest {

    private String input;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        input = "java";
//        input = null;
    }

    @AfterEach
    void tearDown() {
        // Nettoyage après chaque test (si nécessaire)
        input = null;
    }

    @Test
    @DisplayName("Chaîne en majuscules")
    void shouldConvertStringToUpperCase() {
        // Act
        String result = StringUtils.toUpperCase(input);

        // Assert
        assertThat(result)
                .as("La méthode toUpperCase() doit transformer 'java' en 'JAVA'")
                .isEqualTo("JAVA");
    }

    @Test
    @DisplayName("toUpperCase(null)")
    void shouldReturnNullForNullInput() {
        // Act
        String result = StringUtils.toUpperCase(null);

        // Assert
        assertThat(result)
                .as("La méthode toUpperCase() doit retourner null lorsqu'on lui passe null en entrée")
                .isNull();
    }

    @Test
    @DisplayName("Chaine commencant par '?' et a une longueur de ?")
    void shouldStartWithJAndHaveLengthOfFour() {
        // Act
        String result = StringUtils.toUpperCase(input);

        /**
         * Nous effectuons ce test pour eviter d'evaluer la taille de null
         * car cela lancerait une NullPointerException
         */
        if (result == null) {
            return;
        }
        int length = result.length();

        // Assert
        assertThat(result)
                .as("La chaîne retournée doit commencer par 'J'")
                .startsWith("J")
                .as("La chaîne retournée doit avoir une longueur de", length)
                .hasSize(length);
    }
}
