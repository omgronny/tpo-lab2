package expression.extensions;

public class MathExtension {
    public static double sec(final double x) {
        if (Math.abs(Math.cos(x)) < 1E-3) {
            return Double.POSITIVE_INFINITY;
        }

        return 1 / Math.cos(x);
    }
    public static double csc(final double x) {
        if (Math.abs(Math.sin(x)) < 1E-3) {
            return Double.POSITIVE_INFINITY;
        }

        return 1 / Math.sin(x);
    }
}
