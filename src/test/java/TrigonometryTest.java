import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrigonometryTest {

    @BeforeAll
    void cosInit() {
        cosinus = mock(Cosinus.class);

        when(cosinus.cos(0)).thenReturn(1.0);
        when(cosinus.cos(Math.PI / 6)).thenReturn(Math.sqrt(3) / 2);
        when(cosinus.cos(Math.PI / 4)).thenReturn(Math.sqrt(2) / 2);
        when(cosinus.cos(Math.PI / 3)).thenReturn(1.0 / 2);
        when(cosinus.cos(Math.PI / 2)).thenReturn(0.0);
        when(cosinus.cos(Math.PI)).thenReturn(-1.0);
        when(cosinus.cos(3 * Math.PI / 2)).thenReturn(0.0);
        when(cosinus.cos(2 * Math.PI)).thenReturn(1.0);

    }

    @BeforeAll
    void trigInit() {
        tg = new Trigonometry(cosinus);
    }

    @Test
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void sinusTest(final double value) {
        assertEquals(Math.sin(value), tg.sin(value));
    }

    @Test
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void tanTest(final double value) {
        assertEquals(Math.tan(value), tg.tan(value));
    }

    @Test
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void secTest(final double value) {
        assertEquals(MathExtension.sec(value), tg.sec(value));
    }

    @Test
    @ValueSource(doubles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI, 3 * Math.PI / 2, 2 * Math.PI})
    void cscTest(final double value) {
        assertEquals(MathExtension.csc(value), tg.csc(value));
    }

    private Trigonometry tg;
    private Cosinus cosinus;
}
