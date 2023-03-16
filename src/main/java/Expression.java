

public class Expression {

    static double Eval(double x) {
        if (x > 0) {
            return EvalPositive(x);
        } else {
            return EvalNegative(x);
        }
    }

    static double EvalNegative(double x) {
        double div = (Trigonometry.sec(x) + Trigonometry.sec(x)) / Trigonometry.tan(x);
        double square = (div - Trigonometry.csc(x)) * Trigonometry.sin(x);
        return square * square;
    }

    static double EvalPositive(double x) {
        double log_3 = Logarithms.log_3(x);
        double log_2 = Logarithms.log_2(x);
        double log_5 = Logarithms.log_5(x);
        double log_10 = Logarithms.log_10(x);

        double numerator = Math.pow(Math.pow(log_3, 3) + log_2, 3) / log_5;
        double denominator = log_3 * log_5 + (log_5 + log_3) / Math.pow(log_10, 2);

        return numerator / denominator;
    }

}
