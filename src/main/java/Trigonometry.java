
public class Trigonometry {
    private final Cosinus cosinus;

    Trigonometry(Cosinus cos) {
        this.cosinus = cos;
    }


    double sin(double x) {
        double cos = cosinus.cos(x);
        return 1 - cos * cos;
    }

    double tan(double x) {
        return sin(x) / cosinus.cos(x);
    }

    double csc(double x) {
        return 1 / sin(x);
    }

    double sec(double x) {
        return 1 / cosinus.cos(x);
    }


}
