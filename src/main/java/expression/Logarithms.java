package expression;

public class Logarithms {

    private final NaturalLogarithm naturalLogarithm;

    public Logarithms(final NaturalLogarithm naturalLogarithm) {
        this.naturalLogarithm = naturalLogarithm;
    }

    public double log(final double base, final double x) {

        if (x >= 0.99 && x <= 1.001) {
            return 0.0;
        }

        final double lnx = naturalLogarithm.ln(x);
        final double lnBase = naturalLogarithm.ln(base);

        return lnx / lnBase;
    }

    public double log2(final double x) {
        return log(2, x);
    }

    public double log5(final double x) {
        return log(5, x);
    }

    public double log3(final double x) {
        return log(3, x);
    }

    public double log10(final double x) {
        return log(10, x);
    }

}

