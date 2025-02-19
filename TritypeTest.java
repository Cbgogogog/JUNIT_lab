import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(1, 7, 2));
        assertEquals(4, tri.Triang(7, 2, 1));
        assertEquals(4, tri.Triang(-1, 2, 1));
        assertEquals(4, tri.Triang(5, 2, 2));
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(2, tri.Triang(2, 2, 1));
        assertEquals(2, tri.Triang(1, 2, 2));
        assertEquals(2, tri.Triang(2, 1, 2));
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}