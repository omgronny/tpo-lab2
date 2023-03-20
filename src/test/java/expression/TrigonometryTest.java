package expression;

import expression.extensions.MathExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TrigonometryTest {

    private Trigonometry tg;

    @BeforeEach
    void cosInit() {

        final Cosinus cosinus = mock(Cosinus.class);

        when(cosinus.cos(0)).thenReturn(1.0);
        when(cosinus.cos(Math.PI / 6)).thenReturn(Math.sqrt(3) / 2);
        when(cosinus.cos(Math.PI / 4)).thenReturn(Math.sqrt(2) / 2);
        when(cosinus.cos(Math.PI / 3)).thenReturn(1.0 / 2);
        when(cosinus.cos(Math.PI / 2)).thenReturn(0.0);
        when(cosinus.cos(Math.PI)).thenReturn(-1.0);
        when(cosinus.cos(3 * Math.PI / 2)).thenReturn(0.0);
        when(cosinus.cos(2 * Math.PI)).thenReturn(1.0);

        tg = new Trigonometry(cosinus);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void sinusTest(final double value) {

        final double expected = Math.sin(value);
        final double real = tg.sin(value);

        assertTrue(Math.abs(expected - real) < 1E-2, "expected = " + expected + " but real = " + real);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 2 * Math.PI})
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
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
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
