package Punto_3;

import java.util.ArrayList;
import java.util.List;

public class Graph
{
    List<List<Integer>> adjList = null;

    // Constructor
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            adjList.add(new ArrayList<>());
        }

        // agrega bordes al grafo no dirigido
        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            //adjList.get(dest).add(src);
        }
    }
}
