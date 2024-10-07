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

/*
| Memory Address | Object Type                      | Content                                   |
|----------------|----------------------------------|-------------------------------------------|
| 0x001          | GraphNode                        | name: "A"                                 | // NodeA instance
|                |                                  | index: 0                                  | // Index of NodeA in the graph
|                |                                  | neighbours: [0x002] (List of Neighbours)  | // List of neighbours (NodeB)
|----------------|----------------------------------|-------------------------------------------|
| 0x002          | GraphNode                        | name: "B"                                 | // NodeB instance
|                |                                  | index: 1                                  | // Index of NodeB in the graph
|                |                                  | neighbours: [0x001] (List of Neighbours)  | // List of neighbours (NodeA)
|----------------|----------------------------------|-------------------------------------------|
| 0x003          | ArrayList<GraphNode>             | [0x002] (Reference to NodeB)              | // ArrayList for NodeA's neighbours
|----------------|----------------------------------|-------------------------------------------|
| 0x004          | ArrayList<GraphNode>             | [0x001] (Reference to NodeA)              | // ArrayList for NodeB's neighbours
*/
