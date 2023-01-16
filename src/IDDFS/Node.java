package IDDFS;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private int depthLevel;
    private final List<Node> adjancecyList;

    public Node(String name) {
        this.name = name;
        this.adjancecyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Node> getAdjancecyList() {
        return adjancecyList;
    }
    public void addNeighbour(Node node) {
        this.adjancecyList.add(node);
    }

    @Override
    public String toString() {
        return name;
    }
}
