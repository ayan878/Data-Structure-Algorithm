package GraphUsingMatrix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the list of nodes
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 1));
        nodeList.add(new GraphNode("B", 2));
        nodeList.add(new GraphNode("C", 3));
        nodeList.add(new GraphNode("D", 4));
        nodeList.add(new GraphNode("E", 5));

        // Create the graph with the list of nodes
        Graph g = new Graph(nodeList);

        // Add edges to the graph
        g.addUndirected(0, 1);
        g.addUndirected(0, 2);
        g.addUndirected(0, 3);
        g.addUndirected(1, 4);
        g.addUndirected(2, 3);
        g.addUndirected(4, 3);

        // Print the graph
        System.out.println(g.toString());
    }
}
