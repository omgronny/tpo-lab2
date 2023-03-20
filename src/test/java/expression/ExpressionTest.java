package expression;

import expression.extensions.MathExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    static final double EPS = 0.1;
    Trigonometry tg;
    Expression expression;

    @BeforeEach
    void tgInit() {
        tg = mock(Trigonometry.class);

        {
            when(tg.sin(-Math.PI / 6)).thenReturn(-1.0 / 2);
            when(tg.sin(-Math.PI / 4)).thenReturn(-Math.sqrt(2) / 2);
            when(tg.sin(-Math.PI / 3)).thenReturn(-Math.sqrt(3) / 2);
            when(tg.sin(-Math.PI / 2)).thenReturn(-1.0);
            when(tg.sin(-Math.PI)).thenReturn(0.0);
            when(tg.sin(-3 * Math.PI / 2)).thenReturn(1.0);
            when(tg.sin(-2 * Math.PI)).thenReturn(0.0);
        }

        {
            when(tg.tan(-Math.PI / 6)).thenReturn(-Math.sqrt(3) / 3);
            when(tg.tan(-Math.PI / 4)).thenReturn(-1.0);
            when(tg.tan(-Math.PI / 3)).thenReturn(-Math.sqrt(3));
            when(tg.tan(-Math.PI / 2)).thenReturn(Double.NEGATIVE_INFINITY);
            when(tg.tan(-Math.PI)).thenReturn(0.0);
            when(tg.tan(-3 * Math.PI / 2)).thenReturn(Double.POSITIVE_INFINITY);
            when(tg.tan(-2 * Math.PI)).thenReturn(0.0);
        }

        {
            when(tg.sec(-Math.PI / 6)).thenReturn(MathExtension.sec(-Math.PI / 6));
            when(tg.sec(-Math.PI / 4)).thenReturn(MathExtension.sec(-Math.PI / 4));
            when(tg.sec(-Math.PI / 3)).thenReturn(MathExtension.sec(-Math.PI / 3));
            when(tg.sec(-Math.PI / 2)).thenReturn(MathExtension.sec(-Math.PI / 2));
            when(tg.sec(-Math.PI)).thenReturn(MathExtension.sec(-Math.PI));
            when(tg.sec(-3 * Math.PI / 2)).thenReturn(MathExtension.sec(-3 * Math.PI / 2));
            when(tg.sec(-2 * Math.PI)).thenReturn(MathExtension.sec(-2 * Math.PI));
        }

        {
            when(tg.csc(-Math.PI / 6)).thenReturn(MathExtension.csc(-Math.PI / 6));
            when(tg.csc(-Math.PI / 4)).thenReturn(MathExtension.csc(-Math.PI / 4));
            when(tg.csc(-Math.PI / 3)).thenReturn(MathExtension.csc(-Math.PI / 3));
            when(tg.csc(-Math.PI / 2)).thenReturn(MathExtension.csc(-Math.PI / 2));
            when(tg.csc(-Math.PI)).thenReturn(MathExtension.csc(-Math.PI));
            when(tg.csc(-3 * Math.PI / 2)).thenReturn(MathExtension.csc(-3 * Math.PI / 2));
            when(tg.csc(-2 * Math.PI)).thenReturn(MathExtension.csc(-2 * Math.PI));
        }

        expression = new Expression(new Logarithms(new NaturalLogarithm()), tg);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI / 6, -Math.PI / 4, -Math.PI / 3})
    void tableNegative(final double value) {

        final double expected = 1.0;
        final double real = expression.eval(value);

        final double inf = Math.pow(10, 10);

        assertTrue(expected > inf && real > inf ||
                        expected < -inf && real < -inf ||
                        Math.abs(expected - real) < 1E-2,
                value + ": expected = " + expected + " but real = " + real);

    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 6,  Math.PI / 4, Math.PI / 3, Math.PI / 2})
    void tablePositive(final double value) {
        Logarithms log = LogMocks.getLogMock();


            final double expected = (Math.pow((Math.pow(log.log3(value), 3) + log.log2(value)), 3) / log.log5(value))
                    / (log.log3(value) * log.log5(value) +
                    (log.log3(value) + log.log5(value)) / Math.pow(log.log10(value), 2));
            final double real = expression.eval(value);

            final double inf = Math.pow(10, 10);

            assertTrue(expected > inf && real > inf ||
                            expected < -inf && real < -inf ||
                            Math.abs(expected - real) < 1E-2,
                    value + ": expected = " + expected + " but real = " + real);


    }

    @ParameterizedTest
    @ValueSource(doubles = {-5 * Math.PI / 6, -2 * Math.PI / 3, -3 * Math.PI / 4, -Math.PI / 6, -Math.PI / 4, -Math.PI / 3})
    void negativeGoodValues(final double value) {

        final Expression realExpression = new Expression(new Logarithms(new NaturalLogarithm()), new Trigonometry(new Cosinus()));

        final double expected = 1.0;
        final double real = realExpression.eval(value);

        assertEquals(expected, real, EPS,
                value + ": expected = " + expected + " but real = " + real);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, -Math.PI / 2, -Math.PI, -3 * Math.PI / 2, - 2 * Math.PI})
    void negativeOutOfRange(final double value) {

        final Expression realExpression = new Expression(new Logarithms(new NaturalLogarithm()), new Trigonometry(new Cosinus()));

        final double real = realExpression.eval(value);

        assertTrue(Double.isNaN(real), value + ": expression is not NaN but should be");
    }


}
