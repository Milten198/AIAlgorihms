import BFS.BreadthFirstSearch;
import DFS.DepthFirstSearch;
import DFS.DepthFirstSearchRecursive;
import maze.MazeSolver;
import utils.VertexDataHelper;

public class Main {
    public static void main(String[] args) {
        bsfTest();
        dsfTest();
        dsfRecursiveTest();
        mazeTest();
    }

    private static void bsfTest() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfs(VertexDataHelper.getTestData());
    }
    private static void dsfTest() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(VertexDataHelper.getTestData());
    }

    private static void dsfRecursiveTest() {
        DepthFirstSearchRecursive depthFirstSearchRecursive = new DepthFirstSearchRecursive();
        depthFirstSearchRecursive.dfs(VertexDataHelper.getTestData());
    }
    private static void mazeTest() {
        MazeSolver mazeSolver = new MazeSolver(VertexDataHelper.getMazeData(), 0, 0);
        mazeSolver.findWay();
    }

}