package sn.sdley;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.*;

public class DateUtilsTest {

    private LocalDate today;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        today = DateUtils.getToday();
    }

    @AfterEach
    void tearDown() {
        // Nettoyage après chaque test
        today = null;
    }

    /** -----------------------------------------
     * ✅ TESTS DE LA CLASSE DateUtils
     * -----------------------------------------
     */

    @Test
    @DisplayName("Date actuelle")
    void shouldReturnCurrentDate() {
        assertThat(today)
                .as("La méthode getToday() doit retourner la date actuelle")
                .isEqualTo(LocalDate.now());
    }

    @Test
    @DisplayName("DateApres 2000-01-01 et avant 2100-01-01")
    void shouldBeBetween2000And2100() {
        assertThat(today)
                .as("La date doit être après le 1er janvier 2000")
                .isAfter(LocalDate.of(2000, 1, 1))
                .as("La date doit être avant le 1er janvier 2100")
                .isBefore(LocalDate.of(2100, 1, 1));
    }
}
