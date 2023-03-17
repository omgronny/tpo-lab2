import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TrigonometryTest {

    @BeforeAll
    void init() {
        tg = mock(Trigonometry.class);
        when(tg.cos(0)).thenReturn(1.0);
    }

    @Test
    void simple() {

    }

    private Trigonometry tg;
}
