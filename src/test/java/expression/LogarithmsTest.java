package expression;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogarithmsTest {
    private static final double DELTA = 0.05;

    private final Logarithms logarithms = new Logarithms(LogMocks.getLnMock());

    @ParameterizedTest
    @CsvSource({
            "-0.2810013776895098, 1, 6",
            "-0.15009244743411718, 1, 4",
            "0.028654474226683595, 1, 3",
            "0.4971498726941338, 1, 1",
            "0.19611987703015266, 1, 2",
            "NaN, -1, 2",
            "NaN, -1, 4",
            "NaN, -3, 4",
            "NaN, -1, 1",
            "NaN, -5, 4",
            "NaN, -7, 4"
    })
    void tableValuesStubsLog10Test(final double expected, final double num, final double den) {
        final double actual = logarithms.log10(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void nanStubsLog10Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log10(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void positiveInfinityStubsLog10Test() {
        final double expected = Double.POSITIVE_INFINITY;
        final double actual = logarithms.log10(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void negativeInfinityStubsLog10Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log10(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.40202208384670945, 1, 6",
            "-0.15009244743411718, 1, 4",
            "0.028654474226683595, 1, 3",
            "0.711260668712669, 1, 1",
            "0.2805841106392759, 1, 2",
            "NaN, -1, 2",
            "NaN, -1, 4",
            "NaN, -3, 4",
            "NaN, -1, 1",
            "NaN, -5, 4",
            "NaN, -7, 4"
    })
    void tableValuesStubsLog5Test(final double expected, final double num, final double den) {
        final double actual = logarithms.log5(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void nanStubsLog5Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log5(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void positiveInfinityStubsLog5Test() {
        final double expected = Double.POSITIVE_INFINITY;
        final double actual = logarithms.log5(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void negativeInfinityStubsLog5Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log5(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.5889517075792716, 1, 6",
            "-0.21988146115072904, 1, 4",
            "0.028654474226683595, 1, 3",
            "1.0419780459921857, 1, 1",
            "0.4110482924207284, 1, 2",
            "NaN, -1, 2",
            "NaN, -1, 4",
            "NaN, -3, 4",
            "NaN, -1, 1",
            "NaN, -5, 4",
            "NaN, -7, 4"
    })
    void tableValuesStubsLog3Test(final double expected, final double num, final double den) {
        final double actual = logarithms.log3(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void nanStubsLog3Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log3(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void positiveInfinityStubsLog3Test() {
        final double expected = Double.POSITIVE_INFINITY;
        final double actual = logarithms.log3(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void negativeInfinityStubsLog3Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log3(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.9334663712488376, 1, 6",
            "-0.3485038705276813, 1, 4",
            "0.028654474226683595, 1, 3",
            "1.651496129472319, 1, 1",
            "0.6514961294723188, 1, 2",
            "NaN, -1, 2",
            "NaN, -1, 4",
            "NaN, -3, 4",
            "NaN, -1, 1",
            "NaN, -5, 4",
            "NaN, -7, 4"
    })
    void tableValuesStubsLog2Test(final double expected, final double num, final double den) {
        final double actual = logarithms.log2(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void nanStubsLog2Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log2(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void positiveInfinityStubsLog2Test() {
        final double expected = Double.POSITIVE_INFINITY;
        final double actual = logarithms.log2(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void negativeInfinityStubsLog2Test() {
        final double expected = Double.NaN;
        final double actual = logarithms.log2(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
