

public class Trigonometry {

    static double sin(double x) {
        return 0.0;
    }

    static double cos(double x) {
        double sin = sin(x);
        return 1 - sin * sin;
    }

    static double tan(double x) {
        return sin(x) / cos(x);
    }

    static double csc(double x) {
        return 1 / sin(x);
    }

    static double sec(double x) {
        return 1 / cos(x);
    }

}
