// import java.awt.List;
// import java.util.ArrayList;
// import java.util.HashMap;

// import javax.swing.text.html.HTMLDocument.Iterator;

// public class MinSpanningTreePrimsAlgo {
//     public static void main(String[] args) {
//         /*å
//         edges[1][3] = 4;
//         edges[1][2] = 5;
//         edges[2][3] = 5;

//         edges[2][4] = 3;
//         edges[4][5] = 2;
//         edges[4][7] = 6;

//         edges[5][3] = 4;
//         edges[6][7] = 8;
//         edges[7][8] = 2;
//         */
//         java.util.List<Vertex> vertexList = new ArrayList<>();
//         Vertex v1 = new Vertex("v1");
//         Vertex v2 = new Vertex("v2");
//         Vertex v3 = new Vertex("v3");
//         Vertex v4 = new Vertex("v4");
//         Vertex v5 = new Vertex("v5");
//         Vertex v6 = new Vertex("v6");
//         Vertex v7 = new Vertex("v7");
//         Vertex v8 = new Vertex("v8");
//         Vertex v9 = new Vertex("v9");
//         HashMap<Vertex, Edge> edges1 = new HashMap<>();
//         HashMap<Vertex, Edge> edges2 = new HashMap<>();
//         HashMap<Vertex, Edge> edges3 = new HashMap<>();
//         HashMap<Vertex, Edge> edges4 = new HashMap<>();
//         HashMap<Vertex, Edge> edges5 = new HashMap<>();
//         HashMap<Vertex, Edge> edges6 = new HashMap<>();
//         HashMap<Vertex, Edge> edges7 = new HashMap<>();
//         HashMap<Vertex, Edge> edges8 = new HashMap<>();
//         HashMap<Vertex, Edge> edges9 = new HashMap<>();

//         edges1.put(v3, new Edge(4));
//         edges1.put(v2, new Edge(5));
        
//         edges2.put(v3, new Edge(5));
//         edges2.put(v4, new Edge(3));

//         edges3.put(v5, new Edge(4));
//         edges3.put(v2, new Edge(2));
//         edges3.put(v1, new Edge(4));

//         edges4.put(v5, new Edge(2));
//         edges4.put(v2, new Edge(3));
//         edges4.put(v7, new Edge(6));

//         edges5.put(v6, new Edge(1));
//         edges5.put(v4, new Edge(2));
//         edges5.put(v3, new Edge(3));

//         edges6.put(v5, new Edge(1));
//         edges6.put(v7, new Edge(8));
        
//         edges7.put(v8, new Edge(2));
//         edges7.put(v6, new Edge(8));
//         edges7.put(v4, new Edge(6));

//         edges8.put(v7, new Edge(2));
    
//         vertexList.add(v1);
//         Prim prim = new Prim(vertexList);
//         prim.findEdges();
//     }

//     private class Edge {
//         private int weight;
//         private boolean isIncluded = false;
    
//         public Edge(int weight) {
//             this.weight = weight;
//         }
//         public int getWeight() {
//             return this.weight;
//         }
//         public void setIncluded(boolean isIncluded) {
//             this.isIncluded = isIncluded;
//         }
//     }
//         public class Vertex {
//             private String label;
//             private HashMap<Vertex, Edge> edges = new HashMap<Vertex, Edge>();
//             private boolean isVisited = false;

//             public Vertex(String label) {
//                 this.label = label;
//             }
//             public void setVisited(boolean isVisited) {
//                 this.isVisited = isVisited;
//             }
//             public boolean isVisited() {
//                 return this.isVisited;
//             }

//             public Pair<Vertex, Edge> nextMinimum() {
//                 Edge nextMinimum = new Edge(Integer.MAX_VALUE);
//                 Vertex nextVertex = this;
//                 Iterator<Map.Entry<Vertex, Edge>> it = edges.entrySet().iterator();
//                 while(it.hasNext()) {
//                     Map.Entry<Vertex, Node> pair = it.next();
//                     if(!pair.getKey().isIncluded()) {
//                         if(pair.getValue.getWeight() < nextMinimum.getWeight()) {
//                             nextMinimum = pair.getValue();
//                             nextVertex = pair.getValue();
//                         }
//                     }
               
//             }
//             return new Pair<>(nextVertex,nextMinimum);
   
//        }
//         }

//         public class Prim {
//             private java.util.List<Vertex> graph;
            
//             public Prim(java.util.List<Vertex> graph) {
//                 this.graph = graph;
//             }
//             /**
//              * A define a funcntion for finding all the edges in the graph
//              */
//             public void findEdges() {
//                 if (graph.size() > 0) {
//                     graph.get(0).setVisited(true);
//                 }
//                 while (isDisconnected()) {
//                     Edge nextMinimum = new Edge(Integer.MAX_VALUE);
//                     Vertex nextVertex = graph.get(0);

//                     for (Vertex vertex : graph) {
//                         if (vertex.isVisited()) {
//                             Pair<Vertex, Edge> candidate = vertex.nextMinimum();
//                             if (candidate.getValue().getWeight() < nextMinimum.getWeight()) {
//                                 nextMinimum = candidate.getValue();
//                                 nextVertex = candidate.getKey();
//                             }
//                         }
//                     }
//                     nextMinimum.setIncluded(true);
//                     nextVertex.setVisited(true);
//                 }

//             }

//             private boolean isDisconnected() {
//                 for (Vertex vertex : graph) {
//                     if (!vertex.isVisited()) {
//                         return true;
//                     }
//                 }
//                 return false;
//             }
//         }
// }