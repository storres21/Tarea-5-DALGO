package Punto_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Util 
{
    public static int [][] readMatrix() throws FileNotFoundException 
    {
        final Scanner scanner = new Scanner(new File("input.txt"));
        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();

        final int[][] matrix = new int[n1][n2];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();

                }
            }
        }
        return matrix;
    }

    public static void writeMatrix(int [][] matrix) throws FileNotFoundException
    {
        final PrintWriter writer = new PrintWriter("output.txt");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                writer.print(matrix[i][j] + " ");
            }
            writer.println();
        }
        writer.close();
    }
}


