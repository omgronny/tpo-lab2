package expression;

public class Logarithms {

    private final NaturalLogarithm naturalLogarithm;

    private final double ln2 = Math.log(2);
    private final double ln3 = Math.log(3);
    private final double ln5 = Math.log(5);
    private final double ln10 = Math.log(10);

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
        return log(ln2, x);
    }

    public double log3(final double x) {
        return log(ln3, x);
    }

    public double log5(final double x) {
        return log(ln5, x);
    }

    public double log10(final double x) {
        return log(ln10, x);
    }

}

