package sn.sdley;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class ListUtilsTest {

    private List<String> listNoms;
    private List<String> resultList;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        listNoms = Arrays.asList("Alice", "Bob", "Anna");

        // Exécution de filterNames avec la liste mise à jour
        resultList = ListUtils.filterNames(listNoms);
    }

    @AfterEach
    void tearDown() {
        // Nettoyage après chaque test
        listNoms = null;
        resultList = null;
    }

    /** -----------------------------------------
     * ✅ TESTS DE ListUtils (Exercice 2)
     * -----------------------------------------
     */

    @Test
    @DisplayName("Filtrage des noms : doit contenir 'Alice' et 'Anna'")
    void shouldContainAliceAndAnna() {
        assertThat(resultList)
                .as("La liste retournée doit contenir 'Alice' et 'Anna'")
                .contains("Alice", "Anna");
    }

    @Test
    @DisplayName("Filtrage des noms : ne doit pas contenir 'Bob'")
    void shouldNotContainBob() {
        assertThat(resultList)
                .as("La liste retournée ne doit pas contenir 'Bob'")
                .doesNotContain("Bob");
    }

    @Test
    @DisplayName("Filtrage des noms : la liste doit contenir exactement 2 éléments")
    void shouldHaveExactlyTwoElements() {
        assertThat(resultList)
                .as("La liste retournée doit contenir exactement 2 éléments")
                .hasSize(2);
    }
}
