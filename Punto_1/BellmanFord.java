import java.io.FileNotFoundException;

/*
 * This algorithm finds the shortest path between one source vertex and all other vertices in a graph
 */
public class BellmanFord 
{
    public int [] BellmanFordAlgorithm(int [][] graph, int source)
    {
        int [] distance = new int[graph.length];

        for (int i = 0; i < graph.length; i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[source] = 0;

        for (int i = 0; i < graph.length - 1; i++)
        {
            for (int j = 0; j < graph.length; j++)
            {
                for (int k = 0; k < graph.length; k++)
                {
                    if (graph[j][k] != -1 && distance[j] != Integer.MAX_VALUE)
                    {
                        distance[k] = Math.min(distance[k], distance[j] + graph[j][k]);
                    }
                }
            }
        }
        return distance;
    }

    /**
     * Main method
     * @throws FileNotFoundException
     */
    public static void main(String [] args) throws FileNotFoundException
    {
        int [][] graph = Util.readMatrix();
        BellmanFord bellmanFord = new BellmanFord();
        int [][] distanceFromAllVertices = new int [graph.length][graph.length];

        for (int i = 0; i < graph.length; i++)
        {
            int [] distanceFromVertex = bellmanFord.BellmanFordAlgorithm(graph, i);
            distanceFromAllVertices[i] = distanceFromVertex;
        }

        Util.writeMatrix(distanceFromAllVertices);
    }
}
