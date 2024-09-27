package GraphUsingList;

import java.util.ArrayList;

public class GraphNode {
    String name;
    int index;

    ArrayList<GraphNode> neighbours=new ArrayList<GraphNode>();
    GraphNode(String name,int index){
        this.name=name;
        this.index=index;
    }
}
