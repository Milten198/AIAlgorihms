package IDDFS;

import java.util.Stack;

public class IDDFS {

    //this is the node we are looking for
    private final Node targetNode;
    // track whether we have to keep looking for the item or not
    private boolean isTargetFound;
    private int maxLength;

    public IDDFS(Node targetNode) {
        this.targetNode = targetNode;
    }

    public void run(Node root) {
        int depth = 0;
        while (!isTargetFound) {
            if (depth > maxLength) {
                System.out.println("Node is not found...");
                break;
            }
            System.out.println();
            dfs(root, depth);
            depth++;
        }
    }

    private void dfs(Node source, int depthLevel) {
        Stack<Node> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            Node actualNode = stack.pop();
            System.out.print(actualNode + " ");

            // we have to check whether we have found the node
            if (actualNode.getName().equals(targetNode.getName())) {
                System.out.println("\nNode has been found...");
                isTargetFound = true;
                return;
            }

            if (actualNode.getAdjancecyList() != null)
                maxLength = actualNode.getDepthLevel() + 1;

            // this is the IDDFS!!! (we don't want to visit children of that node
            // we want to visit children in the next iteration (next lvl)
            if (actualNode.getDepthLevel() >= depthLevel)
                continue;

            // the standard DFS
            for (Node node : actualNode.getAdjancecyList()) {
                node.setDepthLevel(actualNode.getDepthLevel() + 1);
                stack.push(node);
            }
        }
    }
}
