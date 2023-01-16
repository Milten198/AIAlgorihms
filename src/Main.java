import BFS.BreadthFirstSearch;
import DFS.DepthFirstSearch;
import DFS.DepthFirstSearchRecursive;
import IDDFS.IDDFS;
import IDDFS.Node;
import maze.MazeSolver;
import utils.VertexDataHelper;

public class Main {
    public static void main(String[] args) {
        bsfTest();
        dsfTest();
        dsfRecursiveTest();
        mazeTest();
        IDDFSTest();
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

    private static void IDDFSTest() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");

        nodeA.addNeighbour(nodeB);
        nodeA.addNeighbour(nodeF);
        nodeA.addNeighbour(nodeG);

        nodeB.addNeighbour(nodeC);
        nodeB.addNeighbour(nodeD);

        nodeD.addNeighbour(nodeE);

        nodeG.addNeighbour(nodeH);

        IDDFS algorithm = new IDDFS(nodeE);
        algorithm.run(nodeA);
    }

}