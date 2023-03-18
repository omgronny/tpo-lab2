package expression;

public class Logarithms {

    private final NaturalLogarithm naturalLogarithm;

    private final double LN_2 = Math.log(2);
    private final double LN_3 = Math.log(3);
    private final double LN_5 = Math.log(5);
    private final double LN_10 = Math.log(10);

    public Logarithms(final NaturalLogarithm naturalLogarithm) {
        this.naturalLogarithm = naturalLogarithm;
    }

    private double log(final double lnBase, final double x) {

        if (x >= 0.99 && x <= 1.001) {
            return 0.0;
        }

        final double lnx = naturalLogarithm.ln(x);

        return lnx / lnBase;
    }

    public double log2(final double x) {
        return log(LN_2, x);
    }

    public double log3(final double x) {
        return log(LN_3, x);
    }

    public double log5(final double x) {
        return log(LN_5, x);
    }

    public double log10(final double x) {
        return log(LN_10, x);
    }

}

