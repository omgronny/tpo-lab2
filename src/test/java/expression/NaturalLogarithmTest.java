package expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NaturalLogarithmTest {
    private static final double DELTA = 0.05;

    private final NaturalLogarithm ln = new NaturalLogarithm();

    @ParameterizedTest
    @CsvSource({
            "-0.6470295833786549, 1, 6",
            "-0.2415644752704905, 1, 4",
            "0.046117597181290375, 1, 3",
            "0.7392647777412357, 2, 3",
            "0.8570478133976193, 3, 4",
            "0.9624083290554456, 5, 6",
            "1.2988805656766584, 7, 6",
            "1.3678734371636099, 5, 4",
            "1.432411958301181, 4, 3",
            "1.6555555096153909, 5, 3",
            "1.7043456737848228, 7, 4",
            "1.7508656894197157, 11, 6",
            "1.1447298858494002, 1, 1",
            "1.8378770664093453, 2, 1",
            "0.4515827052894548, 1, 2",
            "2.243342174517509, 3, 1"
    })
    void tableValuesTest(final double expected, final double num, final double den) {
        final double x = num * Math.PI / den;
        if (x < 2) {
            final double actual = ln.ln(x);
            Assertions.assertEquals(expected, actual, DELTA);
        } else {
            final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> ln.ln(x));
            Assertions.assertTrue(exception.getMessage().contains("x must be less than 2"));
        }
    }

    @Test
    void nanStubsTest() {
        final double expected = Double.NaN;
        final double actual = ln.ln(Double.NaN);
        Assertions.assertEquals(expected, actual, DELTA);
    }
}
