import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(2, tri.Triang(2, 2, 3));
    }
}