public class NaturalLogarithm {

    double ln(double x) {
        final double accuracy = 1E-3;
        final double computedCos = calculateLn(x, accuracy);

        if (Math.abs(computedCos) < accuracy) {
            return 0;
        }

        return computedCos;
    }

    private double calculateLn(final double inX, final double accuracy) {

        double x = inX - 1;

        double result = computeLnTaylorSeriesMember(x, 0);
        double currentAccuracy = computeCurrentAccuracy(x, 1);

        int i = 1;
        while (currentAccuracy > accuracy) {
            result += computeLnTaylorSeriesMember(x, i);
            currentAccuracy = computeCurrentAccuracy(x, i);
            i++;
        }

        return result;
    }

    private double computeCurrentAccuracy(final double x, final int n) {
        return Math.pow(x, n + 1) / (n + 1);
    }

    private double computeLnTaylorSeriesMember(final double x, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument n can't be negative: n = " + n);
        }

        return Math.pow(-1, n) * Math.pow(x, n + 1) / (n + 1);
    }
}