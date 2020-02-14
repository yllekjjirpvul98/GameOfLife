public class Grid {


    public int[][] grid;

    public void setGrid(int[][] cells) {
        this.grid = cells;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getCell(int x, int y) {
        return grid[x][y];
    }

    public void setCell(int x, int y, int value) {
        this.grid[x][y] = value;
    }

    public int countAliveNeighbour(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || i >= grid.length|| j < 0 || j >= grid[0].length) {
                    continue;
                }else if (i == x && j == y) {
                    continue;
                }else if (grid[i][j] == 1) {
                    count++;
                }
            }
        }return count;
    }

    public int[][] updateGrid() {
        int[][] newGrid = new int[grid.length][grid[0].length];
        for (int x = 0; x < newGrid.length; x++) {
            for (int y =0; y < newGrid[0].length; y++) {
                int aliveN = countAliveNeighbour(x, y);
                if (aliveN < 2 || aliveN > 4) {
                    newGrid[x][y] = 0;
                }else if (aliveN == 3 && getCell(x,y) == 0) {
                    newGrid[x][y] = 1;
                }else if ((aliveN == 2 || aliveN == 3) && getCell(x, y) == 1) {
                    newGrid[x][y] = 1;
                }else {
                    newGrid[x][y] = grid[x][y];
                }
            }
        }return newGrid;
    }



}