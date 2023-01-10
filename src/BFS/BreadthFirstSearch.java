package BFS;

import utils.Vertex;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    Queue<Vertex> queue;

    public BreadthFirstSearch() {
        this.queue =new LinkedList<>();
    }

    public void bfs(List<Vertex> vertexList) {
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                bfsHelper(v);
            }
        }
    }

    public void bfsHelper(Vertex root) {
        root.setVisited(true);
        queue.add(root);
        System.out.println("\nBreadthFirstSearch: ");
        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.print(actualVertex + " ");
            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
