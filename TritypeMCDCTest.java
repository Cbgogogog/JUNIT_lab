import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testTriang() {  // if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(-1, 2, 7));
        assertEquals(4, tri.Triang(1, -2, 7));
        assertEquals(4, tri.Triang(1, 2, -7));
    }
}