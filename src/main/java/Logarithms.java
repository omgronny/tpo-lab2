public class Logarithms {

    private NaturalLogarithm naturalLogarithm;

    Logarithms(NaturalLogarithm naturalLogarithm) {
        this.naturalLogarithm = naturalLogarithm;
    }

    double log(double base, double x) {
        return naturalLogarithm.ln(x) / naturalLogarithm.ln(base);
    }

    double log_2(double x) {
        return log(2, x);
    }

    double log_5(double x) {
        return log(5, x);
    }

    double log_3(double x) {
        return log(5, x);
    }

    double log_10(double x) {
        return log(10, x);
    }


}

