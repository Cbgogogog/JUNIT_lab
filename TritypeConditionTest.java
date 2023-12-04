import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    @Test
    public void testTriang() {  // if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, -2, -1));
        assertEquals(2, tri.Triang(1, 2, 2));
    }
}