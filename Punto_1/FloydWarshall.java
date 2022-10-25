/*
 * This algorithm finds the shortest path between all pairs of vertices in a graph
 */
public class FloydWarshall 
{
    public int [][] FloydWarshallAlgorithm(int [][] graph) 
    {
        int vertices = graph.length;
        int [][] matrix = new int[vertices][vertices];
        
        for (int k = 0; k <= vertices; k++)
        {
            for (int i = 0; i < vertices; i++)
            {
                for (int j = 0; j < vertices; j++)
                {
                    if (k == 0)
                    {
                        if (graph[i][j] == -1)
                        {
                            matrix[i][j] = Integer.MAX_VALUE;
                        }
                        else
                        {
                            matrix[i][j] = graph[i][j];
                        }
                    }
                    else if (k > 0 && i != k - 1 && j != k - 1)
                    {
                        if (matrix[i][k - 1] == Integer.MAX_VALUE || matrix[k - 1][j] == Integer.MAX_VALUE)
                        {
                            matrix[i][j] = matrix[i][j];
                        }
                        else
                        {
                            matrix[i][j] = Math.min(matrix[i][j], matrix[i][k - 1] + matrix[k - 1][j]);
                        }
                    }
                }
            }
        }

        return matrix;
    }

    /*
     * Main method
     */
    public static void main(String[] args)
    {
        int [][] graph = new int [][]{ 
            {0, 1, 8}, 
            {1, 0, 2}, 
            {8, 2, 0}
        };

        FloydWarshall floydWarshall = new FloydWarshall();
        int [][] matrix = floydWarshall.FloydWarshallAlgorithm(graph);

        System.out.println();
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
