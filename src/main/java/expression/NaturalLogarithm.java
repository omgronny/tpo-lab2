package expression;

import java.io.FileWriter;
import java.io.IOException;

public class NaturalLogarithm {

    public double ln(final double x) {
        if (x > 2) {
            throw new IllegalArgumentException("x must be less than 2");
        }

        final double accuracy = 1E-3;
        final double computedCos = calculateLn(x, accuracy);

        if (Math.abs(computedCos) < accuracy) {
            return 0;
        }

        return computedCos;
    }

    private double calculateLn(final double inX, final double accuracy) {

        final double x = inX - 1;

        double result = computeLnTaylorSeriesMember(x, 0);
        double currentAccuracy = computeCurrentAccuracy(x, 0);

        int i = 1;
        while (currentAccuracy > accuracy / 10) {
            result += computeLnTaylorSeriesMember(x, i);
            currentAccuracy = computeCurrentAccuracy(x, i);
            i++;
        }

        return result;
    }

    private double computeCurrentAccuracy(final double x, final int n) {
        return Math.abs(Math.pow(x, n + 2) / (n + 2));
    }

    private double computeLnTaylorSeriesMember(final double x, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument n can't be negative: n = " + n);
        }

        return Math.pow(-1, n) * Math.pow(x, n + 1) / (n + 1);
    }

    public void saveToCsv(final String filePath, final double start, final double limit, final double step) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(toCsv(start, limit, step));
            writer.flush();
        }
    }

    public String toCsv(final double start, final double limit, final double step) {
        double x = start;
        final StringBuilder result = new StringBuilder();
        while (x <= limit) {
            result.append(x).append(", ").append(ln(x)).append("\n");
            x += step;
        }
        return result.toString();
    }
}
