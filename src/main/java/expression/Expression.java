package expression;

public class Expression {

    private final Logarithms lg;
    private final Trigonometry tg;

    public Expression(final Logarithms lg, final Trigonometry tg) {
        this.lg = lg;
        this.tg = tg;
    }

    public double eval(final double x) {
        if (x > 0) {
            // any x in (0; +inf)
            // x -> +inf => f(x) -> +inf
            // x -> 0 => f(x) -> -inf
            return evalPositive(x);
        } else {
            // any x in (-inf; 0]
            // f(x) = 1
            return evalNegative(x);
        }
    }

    private double evalNegative(final double x) {

        final double div = (tg.sec(x) + tg.sec(x)) / tg.tan(x);
        final double square = (div - tg.csc(x)) * tg.sin(x);

        return square * square;
    }

    private double evalPositive(final double x) {

        final double log3 = lg.log3(x);
        final double log2 = lg.log2(x);
        final double log5 = lg.log5(x);
        final double log10 = lg.log10(x);

        final double numerator = Math.pow(Math.pow(log3, 3) + log2, 3) / log5;
        final double denominator = log3 * log5 + (log5 + log3) / Math.pow(log10, 2);

        if (Math.abs(numerator) == Double.POSITIVE_INFINITY && Math.abs(denominator) == Double.POSITIVE_INFINITY) {
            return 1;
        }

        return numerator / denominator;
    }
}
