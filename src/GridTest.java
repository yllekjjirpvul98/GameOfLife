import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void testGetter() {
        Grid grid = new Grid();
        assertEquals(grid.grid, grid.getGrid());
    }

}