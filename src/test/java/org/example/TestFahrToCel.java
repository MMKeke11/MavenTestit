public class TestFahrToCel {
    @Test
    public void testConvertFahrToCel() {
        float fahr = 32;
        float cel = FahrToCel.convertFahrToCel(fahr);
        assert cel == 0;
    }
}
