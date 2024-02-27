package org.example.Converters;

public class FahrToCel {
    public static float convertFahrToCel(float fahr) {
        float cel = (fahr - 32) * 5 / 9;
        return Math.round(cel);
    }

}
