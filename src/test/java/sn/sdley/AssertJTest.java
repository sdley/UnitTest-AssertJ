package sn.sdley;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AssertJTest {
    @Test
    void testInstallation() {
        String message = "AssertJ fonctionne!";
        assertThat(message).isNotNull()
                .isNotEmpty()
                .isEqualTo("AssertJ fonctionne!");
    }
}