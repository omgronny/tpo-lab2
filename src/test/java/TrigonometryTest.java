import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
    void simple() {
        assertEquals(0, tg.sin(0));
        assertEquals(1.0 / 2, tg.sin(Math.PI / 6));
        assertEquals(Math.sqrt(3) / 2, tg.sin(Math.PI / 3));
    }

    private Trigonometry tg;
    private Cosinus cosinus;
}
