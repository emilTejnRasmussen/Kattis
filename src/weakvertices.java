import java.util.*;

public class weakvertices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();  // number of vertices
            if (n == -1) break;    // end of input

            int[][] graph = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = sc.nextInt();
                }
            }

            List<Integer> weakVertices = new ArrayList<>();

            // check each vertex
            for (int v = 0; v < n; v++) {
                boolean inTriangle = false;

                // collect neighbors of vertex v
                List<Integer> neighbors = new ArrayList<>();
                for (int u = 0; u < n; u++) {
                    if (graph[v][u] == 1) neighbors.add(u);
                }

                // check all pairs of neighbors to see if they are connected
                for (int i = 0; i < neighbors.size() && !inTriangle; i++) {
                    for (int j = i + 1; j < neighbors.size(); j++) {
                        int u = neighbors.get(i);
                        int w = neighbors.get(j);
                        if (graph[u][w] == 1) {
                            inTriangle = true;  // vertex v is part of a triangle
                            break;              // stop checking more pairs
                        }
                    }
                }

                if (!inTriangle) weakVertices.add(v);  // vertex is weak
            }

            // print weak vertices in increasing order
            for (int i = 0; i < weakVertices.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(weakVertices.get(i));
            }
            System.out.println();
        }
        sc.close();
    }
}
