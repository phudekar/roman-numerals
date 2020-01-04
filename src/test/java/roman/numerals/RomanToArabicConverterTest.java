package roman.numerals;

import org.junit.Assert;
import org.junit.Test;

public class RomanToArabicConverterTest {
    @Test
    public void shouldConvertITo1() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("I");

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldConvertSmallCaseITo1() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("i");

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldConvertIITo2() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("II");

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldConvertIIITo3() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("III");

        // then
        Assert.assertEquals(3, result);
    }

    @Test
    public void shouldConvertVTo5() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("V");

        // then
        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldConvertXITo11() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("XI");

        // then
        Assert.assertEquals(11, result);
    }

    @Test
    public void shouldConvertIVTo4() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("IV");

        // then
        Assert.assertEquals(4, result);
    }
    @Test
    public void shouldConvertXIXTo19() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("XIX");

        // then
        Assert.assertEquals(19, result);
    }

    @Test
    public void shouldConvertXLTo40() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("XL");

        // then
        Assert.assertEquals(40, result);
    }

    @Test
    public void shouldConvertCTo40() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("XL");

        // then
        Assert.assertEquals(40, result);
    }

    @Test
    public void shouldConvertCMXLIXTo949() {
        // given
        final RomanToArabicConverter converter = new RomanToArabicConverter();

        // when
        final int result = converter.convert("CMXLIX");

        // then
        Assert.assertEquals(949, result);
    }
}
