package expression;

import org.apache.commons.math3.util.CombinatoricsUtils;

import java.io.FileWriter;
import java.io.IOException;

public class Cosinus {

    public double cos(final double x) {
        final double accuracy = 1E-3;
        final double computedCos = calculateCos(x, accuracy);

        if (Math.abs(computedCos) < accuracy) {
            return 0.0;
        }

        return Math.min(Math.max(computedCos, -1), 1);
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

    public void saveToCsv(String filePath, double start, double limit, double step){
        try(FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(toCsv(start, limit, step));
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String toCsv(double start, double limit, double step){
        StringBuilder result = new StringBuilder();
        while (start <= limit){
            result.append(start).append(", ").append(cos(start)).append("\n");
            start += step;
        }
        return result.toString();
    }
}
