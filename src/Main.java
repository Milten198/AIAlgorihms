public class Main {
    public static void main(String[] args) {
        bsfTest();
        dfsTest();
        dsfRecursiveTest();
    }

    private static void dfsTest() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(VertexDataHelper.getTestData());
    }

    private static void bsfTest() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfs(VertexDataHelper.getTestData());
    }

    private static void dsfRecursiveTest() {
        DepthFirstSearchRecursive depthFirstSearchRecursive = new DepthFirstSearchRecursive();
        depthFirstSearchRecursive.dfs(VertexDataHelper.getTestData());
    }


}