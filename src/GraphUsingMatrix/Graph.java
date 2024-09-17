package GraphUsingMatrix;

import java.util.ArrayList;

public class Graph {
    private ArrayList<GraphNode> nodeList;
    private  int[][] adjacentMatrix;
    public Graph(ArrayList<GraphNode>nodeList){
        this.nodeList=nodeList;
        adjacentMatrix=new int[nodeList.size()][nodeList.size()];
    }
    public void addUndirected(int i,int j){
        adjacentMatrix[i][j]=1;
        adjacentMatrix[j][i]=1;
    }
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("   ");
        for (GraphNode node:nodeList) {
                s.append(node.name+" ");
        }
        s.append("\n");

        // Append matrix rows with node names and adjacency matrix values
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name).append(": ");
            for (int j = 0; j < nodeList.size(); j++) {
                s.append(adjacentMatrix[i][j]).append(" ");
            }
            s.append("\n");
        }

        return s.toString();
    }
}
