package Converters;

import org.example.Converters.kelvinToCel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestKelvinToCel {
    @Test
    public void testKelvinToCel() {
        float kel = 273.15f;
        float cel = kelvinToCel.convertkelvinToCel(kel);
        assertEquals(0, cel, 0.001);

    }
}
