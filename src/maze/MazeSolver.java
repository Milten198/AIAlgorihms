package maze;

public class MazeSolver {

    private final int[][] maze;
    private final boolean[][] visited;
    private final int startRow;
    private final int startCol;

    public MazeSolver(int[][] maze, int startRow, int startCol) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }

    public void findWay() {
        System.out.println("\nMaze problem");
        if (dfs(startRow, startCol))
            System.out.println("Solution exists...");
        else
            System.out.println("No solution exists");
    }

    private boolean isFeasible(int x, int y) {
        if (x < 0 || x > maze.length - 1)
            return false;
        if (y < 0 || y > maze.length - 1)
            return false;
        if (visited[x][y])
            return false;
        if (maze[x][y] == 1)
            return false;

        return true;
    }

    private boolean dfs(int x, int y) {
        if (x == maze.length - 1 && y == maze.length - 1)
            return true;

        if (isFeasible(x, y)) {
            visited[x][y] = true;
            // then we have to visit the next cells (U, D, L, R)

            if (dfs(x + 1, y))
                return true;

            if (dfs(x - 1, y))
                return true;

            if (dfs(x, y + 1))
                return true;

            if (dfs(x, y - 1))
                return true;

            //Backtrack
            visited[x][y] = false;
            return false;
        }
        return false;
    }
}
