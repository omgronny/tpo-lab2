package expression;

public class Trigonometry {
    private final Cosinus cosinus;

    public Trigonometry(final Cosinus cos) {
        this.cosinus = cos;
    }

    public double sin(final double x) {
        final double cos = cosinus.cos(x);
        int sign = 1;
        final double smallX = x % (2 * Math.PI);
        if (smallX > Math.PI) {
            sign = -1;
        }
        return sign * Math.sqrt(1 - cos * cos);
    }

    public double tan(final double x) {

        return sin(x) / cosinus.cos(x);
    }

    public double csc(final double x) {
        return 1 / sin(x);
    }

    public double sec(final double x) {
        return 1 / cosinus.cos(x);
    }


}
