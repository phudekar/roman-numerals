package roman.numerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToArabicConverterTest {
    RomanToArabicConverter converter;

    @Before
    public void beforeEach(){
       converter = new RomanToArabicConverter();
    }
    @Test
    public void shouldConvertITo1() {
        final int result = converter.convert("I");
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldConvertSmallCaseITo1() {
        final int result = converter.convert("i");
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldConvertIITo2() {
        final int result = converter.convert("II");
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldConvertIIITo3() {
        final int result = converter.convert("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void shouldConvertVTo5() {
        final int result = converter.convert("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldConvertXITo11() {
        final int result = converter.convert("XI");
        Assert.assertEquals(11, result);
    }

    @Test
    public void shouldConvertIVTo4() {
        final int result = converter.convert("IV");
        Assert.assertEquals(4, result);
    }
    @Test
    public void shouldConvertXIXTo19() {
        final int result = converter.convert("XIX");
        Assert.assertEquals(19, result);
    }

    @Test
    public void shouldConvertXLTo40() {
        final int result = converter.convert("XL");
        Assert.assertEquals(40, result);
    }

    @Test
    public void shouldConvertCTo40() {
        final int result = converter.convert("XL");
        Assert.assertEquals(40, result);
    }

    @Test
    public void shouldConvertCMXLIXTo949() {
        final int result = converter.convert("CMXLIX");
        Assert.assertEquals(949, result);
    }
}
