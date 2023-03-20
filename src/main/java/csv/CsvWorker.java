package csv;

import expression.Expression;

import java.io.FileWriter;
import java.io.IOException;

public class CsvWorker {
    private final Expression expression;

    public CsvWorker(final Expression expression) {
        this.expression = expression;
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
            result.append(x).append(", ").append(expression.eval(x)).append("\n");
            x += step;
        }
        return result.toString();
    }
}
