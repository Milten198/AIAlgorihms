import java.util.List;

public class DepthFirstSearchRecursive {

    public void dfs(List<Vertex> vertexList) {
        System.out.println("\nDepthFirstSearchRecursive");
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dsfHelper(v);
            }
        }
    }

    private void dsfHelper(Vertex root) {
        System.out.print(root + " ");
        for (Vertex v : root.getAdjacencyList()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dsfHelper(v);
            }
        }
    }
}
