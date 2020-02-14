public class Grid {


    public int[][] grid = new int[5][5];

    public int[][] getGrid() {
        return grid;
    }

    public int getCell(int x, int y) {
        return grid[x][y];
    }

    public void setCell(int x, int y, int value) {
        this.grid[x][y] = value;
    }

}