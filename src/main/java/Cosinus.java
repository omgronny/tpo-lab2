import org.apache.commons.math3.util.CombinatoricsUtils;

public class Cosinus {

    double cos(double x) {
        final double accuracy = 1E-3;
        final double computedCos = calculateCos(x, accuracy);

        if (Math.abs(computedCos) < accuracy) {
            return 0.0;
        }

        return computedCos;
    }

    private double calculateCos(final double bigX, final double accuracy) {
        final double x = bigX % (2 * Math.PI);

        double result = computeCosTaylorSeriesMember(x, 0);
        double currentAccuracy = computeCurrentAccuracy(x, 1);

        int i = 1;
        while (currentAccuracy > accuracy) {
            result += computeCosTaylorSeriesMember(x, i);
            currentAccuracy = computeCurrentAccuracy(x, i);
            i++;
        }

        return result;
    }

    private double computeCurrentAccuracy(final double x, final int n) {
        return Math.pow(x, 2 * n) / CombinatoricsUtils.factorial(2 * n);
    }

    private double computeCosTaylorSeriesMember(final double x, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument n can't be negative: n = " + n);
        }

        return Math.pow(-1, n) * Math.pow(x, 2 * n) / CombinatoricsUtils.factorial(2 * n);
    }

}
