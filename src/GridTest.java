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
        assertEquals(2, grid.getCell(0,0));
    }

    @Test
    public void testCountAliveNeighbours () {
        Grid grid = new Grid();
        int[][] board = { {0, 0, 0}, {1,1,1}, {0,0,0}};
        grid.setGrid(board);
        assertEquals(2, grid.countAliveNeighbour(0, 2) );
    }

    @Test
    public void testUpdateGrid () {
        Grid grid = new Grid();
        int[][] board = { {0, 0, 0}, {1,1,1}, {0,0,0}};
        int[][] exBoard = { {0, 1, 0}, {0,1,0}, {0,1,0}};
        grid.setGrid(board);
        int[][] newGrid = grid.updateGrid();
        assertEquals(exBoard, newGrid);
    }

}