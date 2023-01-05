package modern.features.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Nested
@DisplayName("Test method getDamageToPlanet(SingleUsePlastic)")
class PlanetTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Get damage to Planet when CUP")
    void getDamageToPlanetWithoutPatternWhenCUP() {
        assertEquals(100, new Planet().getDamageToPlanetWithoutPattern(Planet.SingleUsePlastic.CUP));
    }

    @Test
    @DisplayName("get damage to Planet when STRAW")
    void getDamageToPlanetWithPatternWhenSTRAW() {
        assertEquals(100, new Planet().getDamageToPlanetWithPattern(Planet.SingleUsePlastic.STRAW));
    }
}