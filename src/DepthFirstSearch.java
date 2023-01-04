import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final Stack<Vertex> stack;

    public DepthFirstSearch() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {
        for (Vertex v: vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dsfHelper(v);
            }
        }
    }

    private void dsfHelper(Vertex root) {
        stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);
            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }

}
