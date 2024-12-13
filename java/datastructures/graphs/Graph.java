import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

// unidirected graph
public class Graph {
    int numberOfNodes;
    HashMap<Integer, HashSet<Integer>> adjacentList;

    public addVertex(int value){
        // see if the node already exists
        HashSet<Integer> edges = adjacentList.get(value);
        if(edges==null) {
            adjacentList.put(value, new HashSet<>());
            numberOfNodes++;
        }
    }
        public addEdge(int node1, int node2) {
            // find edges if nodes exist
            HashSet<Integer> node1Edges = adjacentList.get(node1);
            HashSet<Integers> node2Edges = adjacentList.get(node2);
            if(node1Edges!= null && node2Edges != null) {
                // nodes exist, safe to add edges to nodes
                node1Edges.add(node2);
                node2Edges.add(node1);
            }

    }

    public showConnections() {

    }
}
