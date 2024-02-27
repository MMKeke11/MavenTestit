package Converters;


import org.junit.jupiter.api.Test;

import static org.example.Converters.FahrToCel.convertFahrToCel;

public class TestFahrToCel {
    @Test
    public void testConvertFahrToCel() {
        float fahr = 32;
        float cel = convertFahrToCel(fahr);
        assert cel == 0;
    }
}
