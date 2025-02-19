package sn.sdley;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        person = new Person("Alice", 30);
    }

    @AfterEach
    void tearDown() {
        // Nettoyage après chaque test
        person = null;
    }

    /** -----------------------------------------
     * ✅ TESTS DE LA CLASSE Person
     * -----------------------------------------
     */

    @Test
    @DisplayName("Person('Alice', 30)")
    void shouldHaveCorrectNameAndAge() {
        assertThat(person.getName())
                .as("Le nom de la personne doit être 'Alice'")
                .isEqualTo("Alice");

        assertThat(person.getAge())
                .as("L'âge de la personne doit être 30")
                .isEqualTo(30);
    }

    @Test
    @DisplayName("Personnes identiques")
    void shouldBeEqualUsingRecursiveComparison() {
        // Création d'un autre objet identique
        Person anotherPerson = new Person("Alice", 30);

        // Vérification avec usingRecursiveComparison()
        assertThat(person)
                .as("Les deux objets Person doivent être identiques")
                .usingRecursiveComparison()
                .isEqualTo(anotherPerson);
    }
}
