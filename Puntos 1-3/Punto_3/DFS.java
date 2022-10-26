package Punto_3;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;



public class DFS
{
    static boolean tieneCiclos = false;

    public static void DFS(Graph graph, int v, boolean[] discovered)
    {
        // marca el nodo actual como descubierto
        discovered[v] = true;

        for (int u : graph.adjList.get(v)) {
            if (discovered[u] == true) {
                tieneCiclos = true;
            }

            if (!discovered[u]) {
                DFS(graph, u, discovered);
            }
        }
    }

    public static void main (String[]args) throws FileNotFoundException
    {
        int[][] graph = new int[0][];
        try
        {
            graph = Util.readMatrix();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        ArrayList<Edge> edge1 = new ArrayList<Edge>();

        for (int i = 0; i < graph.length; ++i) {
            for (int j = 0; j < graph[i].length; ++j) {
                if (graph[i][j] > 0) {
                    edge1.add(new Edge(i, j));
                }
            }
        }

        List<Edge> edges = edge1;
        int n = graph.length;
        Graph graph1 = new Graph(edges, n);

        boolean[] discovered = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!discovered[i]) {
                DFS(graph1, i, discovered);
            }
        }
        if (tieneCiclos == true)
        {
            Util.writeText("La matriz tiene ciclos");
        }
        else
        {
            Util.writeText("La matriz NO tiene ciclos");
        }
    }
}
