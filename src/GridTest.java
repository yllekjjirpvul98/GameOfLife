import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void testGetter() {
        Grid grid = new Grid();
        assertEquals(grid.grid, grid.getGrid());
    }

    @Test
    public void testSetter() {
        Grid grid = new Grid();
        grid.setCell(0, 0, 1);
        assertEquals(1, grid.getCell(0,0));
    }

}