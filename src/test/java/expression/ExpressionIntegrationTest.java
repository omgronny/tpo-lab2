package expression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpressionIntegrationTest {

    static final double EPS = 0.1;
    Expression expression;

    @BeforeEach
    void tgInit() {
        expression = new Expression(new Logarithms(new NaturalLogarithm()), new Trigonometry(new Cosinus()));
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

//    @Test
//    void allPositive() {
//
//        for (double value = 0.01; value <= 2.0; value += 0.1) {
//
//            if (value >= 0.99 && value <= 1.001) {
//                continue;
//            }
//
//            final double expected = 1.0; // TODO посчитать значение
//            final double real = expression.eval(value);
//
//            final double inf = Math.pow(10, 10);
//
//            assertTrue(expected > inf && real > inf ||
//                            expected < -inf && real < -inf ||
//                            Math.abs(expected - real) < 1E-2,
//                    value + ": expected = " + expected + " but real = " + real);
//
//        }
//
//    }
//    // TODO: анализ эквивалентности + тесты для реальных логарифмов

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
