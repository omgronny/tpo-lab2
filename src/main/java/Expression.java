

public class Expression {

    double Eval(double x) {
        if (x > 0) {
            // any x in (0; +inf)
            // x -> +inf => f(x) -> +inf
            // x -> 0 => f(x) -> -inf
            return EvalPositive(x);
        } else {
            // any x in (-inf; 0]
            // f(x) = 1
            return EvalNegative(x);
        }
    }

    double EvalNegative(double x) {
        Trigonometry tg = new Trigonometry(new Cosinus());

        double div = (tg.sec(x) + tg.sec(x)) / tg.tan(x);
        double square = (div - tg.csc(x)) * tg.sin(x);
        return square * square;
    }

    double EvalPositive(double x) {
        Logarithms lg = new Logarithms(new NaturalLogarithm());

        double log_3 = lg.log_3(x);
        double log_2 = lg.log_2(x);
        double log_5 = lg.log_5(x);
        double log_10 = lg.log_10(x);

        double numerator = Math.pow(Math.pow(log_3, 3) + log_2, 3) / log_5;
        double denominator = log_3 * log_5 + (log_5 + log_3) / Math.pow(log_10, 2);

        return numerator / denominator;
    }

}
