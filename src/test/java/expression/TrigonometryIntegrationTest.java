package expression;

import expression.extensions.MathExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TrigonometryIntegrationTest {
    Trigonometry tg;

    @BeforeEach
    void init() {
        tg = new Trigonometry(new Cosinus());
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void sinusTest(final double value) {
        final double expected = Math.sin(value);
        final double real = tg.sin(value);

        assertTrue(Math.abs(expected - real) < 1E-2, value + ":expected = " + expected + " but real = " + real);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, 2 * Math.PI})
    void tanTest(final double value) {

        final double expected = Math.tan(value);
        final double real = tg.tan(value);

        final double inf = Math.pow(10, 10);

        assertTrue(expected > inf && real > inf ||
                        expected < -inf && real < -inf ||
                        Math.abs(expected - real) < 1E-2,
                value + ": expected = " + expected + " but real = " + real);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void secTest(final double value) {
        final double expected = MathExtension.sec(value);
        final double real = tg.sec(value);

        final double inf = Math.pow(10, 10);

        assertTrue(expected > inf && real > inf ||
                        expected < -inf && real < -inf ||
                        Math.abs(expected - real) < 1E-2,
                value + ": expected = " + expected + " but real = " + real);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, 3 * Math.PI / 2, 2 * Math.PI})
    void cscTest(final double value) {
        final double expected = MathExtension.csc(value);
        final double real = tg.csc(value);

        final double inf = Math.pow(10, 10);

        assertTrue(expected > inf && real > inf ||
                        expected < -inf && real < -inf ||
                        Math.abs(expected - real) < 1E-2,
                value + ": expected = " + expected + " but real = " + real);
    }

}
