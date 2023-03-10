import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        bsfTest();
        dfsTest();
        dsfRecursiveTest();
    }

    private static void dfsTest() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(getTestData());
    }

    private static void bsfTest() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfs(getTestData());
    }

    private static void dsfRecursiveTest() {
        DepthFirstSearchRecursive depthFirstSearchRecursive = new DepthFirstSearchRecursive();
        depthFirstSearchRecursive.dfs(getTestData());
    }

    private static List<Vertex> getTestData() {
        List<Vertex> list;
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        list = Arrays.asList(a, b, c, d, e, f, g, h);

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);

        b.addNeighbor(a);
        b.addNeighbor(c);
        b.addNeighbor(d);

        c.addNeighbor(b);

        d.addNeighbor(e);
        d.addNeighbor(b);

        e.addNeighbor(d);

        f.addNeighbor(a);

        g.addNeighbor(h);
        g.addNeighbor(a);

        h.addNeighbor(g);

        return list;
    }
}