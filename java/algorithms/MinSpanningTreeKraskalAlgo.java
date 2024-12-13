import java.util.Arrays;

public class MinSpanningTreeKraskalAlgo {
    public static void main(String[] args) {
        int[][] edges = new int[2][2];
        edges[1][3] = 4;
        edges[1][2] = 5;
        edges[2][3] = 5;

        edges[2][4] = 3;
        edges[4][5] = 2;
        edges[4][7] = 6;

        edges[5][3] = 4;
        edges[6][7] = 8;
        edges[7][8] = 2;

        int ans = Pair.KraskalAlgo(2, edges);
        System.out.println("The min cost for this algorithm is: " + ans);
        
    }
    static int[] parent;
    static int[] rank;

    public static class Pair implements Comparable<Pair> {
            int v1;
            int v2;
            int weight;

            Pair(int v1, int v2, int weight) {
                this.v1= v1;
                this.v2 = v2;
                this.weight = weight;
            }

            @Override
            public int compareTo(Pair o) {
                return this.weight - o.weight;
            }

            public static int KraskalAlgo(int n, int[][] edge) {
                Pair[] edges = new Pair[edge.length];
                for(int i= 0; i<edge.length; i++) {
                    int v1 = edge[i][0];
                    int v2 = edge[i][1];
                    int weight = edge[i][2];
                    edges[i]  = new Pair(v1, v2, weight);

                }

                int ans = 0;
                Arrays.sort(edges);

                parent = new int[n+1];
                rank = new int[n+1];

                for(int i = 0; i<parent.length; i++) {
                    parent[i] = i;
                    rank[i] = 1;

                }

                for(int i =0; i< edges.length; i++) {
                    int vertex1 = edges[i].v1;
                    int vertex2 = edges[i].v2;
                    int weight = edges[i].weight;

                    boolean flag = union(vertex1, vertex2);

                    if(flag == false ) {
                        ans += weight;
                    }
                }
                return ans;
            }

            public static int find(int component) {
                if(parent[component] == component){
                    return component;
                }
                int temp = find(parent[component]);
                parent[component] = temp;
                return temp;
            }


            public static boolean union(int v1, int v2) {
                int parent1 = find(v1);
                int parent2 = find(v2);
                if(parent1 == parent2) {
                    return true;
                }

                if(rank[parent1] > rank[parent2]) {
                    parent[parent2] = parent[parent1];

                } else if(rank[parent2] > rank[parent1]) {
                    parent[parent1] = parent[parent2];
                } else {
                    parent[parent1] = parent2;
                    rank[parent2]++;
                }
                return false;
            }
    }
}
