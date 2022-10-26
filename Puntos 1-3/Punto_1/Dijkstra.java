package Punto_1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * This algorithm finds the shortest path between one source vertex and all other vertices in a graph
 */
public class Dijkstra 
{
    private HashMap<Integer, ArrayList<Integer>> paths;

    public Dijkstra()
    {
        this.paths = new HashMap<Integer, ArrayList<Integer>>();
    }

    public int [] DijkstraAlgorithm(int [][] graph, int source) 
    {
        boolean [] visited = new boolean[graph.length];
        int [] distance = new int[graph.length]; 

        for (int i = 0; i < graph.length; i++)
        {
            distance[i] = graph[source][i];

            if (graph[source][i] != -1 && graph[source][i] != 0)
            {
                ArrayList<Integer> path = new ArrayList<Integer>();
                path.add(source);
                paths.put(i, path);
            }
        }

        visited[source] = true;

        for (int i = 0; i < graph.length; i++)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            /*
             * Find the vertex with the minimum distance from the source vertex
             */
            for (int j = 0; j < graph[i].length; j++)
            {
                if (!visited[j] && distance[j] != -1 && distance[j] < min)
                {
                    min = distance[j];
                    minIndex = j;
                }
            }

            /*
             * Update the distance of the vertices adjacent to the vertex with the minimum distance
             */
            if (minIndex != -1)
            {
                visited[minIndex] = true;

                for (int j = 0; j < graph[minIndex].length; j++)
                {
                    if (!visited[j] && graph[minIndex][j] != -1 && distance[j] != -1)
                    {
                        int copy = distance[j];
                        distance[j] = Math.min(distance[j], distance[minIndex] + graph[minIndex][j]);
                        if (distance[minIndex] + graph[minIndex][j] < copy)
                        {
                            if (paths.containsKey(j))
                            {
                                paths.get(j).add(minIndex);
                            }
                            else
                            {
                                ArrayList<Integer> path = new ArrayList<Integer>();
                                path.add(source);
                                path.add(minIndex);
                                paths.put(j, path);
                            }
                        }

                    }
                }
            }
        }
        return distance;
    }

    public ArrayList<Integer> getPath(Integer destination)
    {
        ArrayList<Integer> path = paths.get(destination);
        path.add(destination);
        return path;
    }

    /*
     * Main method
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        int [][] graph = Util.readMatrix();
        Dijkstra dijkstra = new Dijkstra();
        int [][] distanceFromAllVertices = new int [graph.length][graph.length];

        for (int i = 0; i < graph.length; i++)
        {
            int [] distanceFromVertex = dijkstra.DijkstraAlgorithm(graph, i);
            distanceFromAllVertices[i] = distanceFromVertex;
        }

        Util.writeMatrix(distanceFromAllVertices);
    }
}
