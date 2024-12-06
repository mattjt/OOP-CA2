package org.example.Question4;

import java.util.Scanner;
import java.util.Stack;


/**
 *  Name: Matthew Tomkins
 *  Class Group: SD2b
 */

public class Question4  // Flood Fill (Stack, 2D Array)
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startRow=-1;
        int startCol = -1;
        int[][] matrix = floodFillStart();

        while(true){
            System.out.print("Enter starting row (0-9):");
            startRow = scan.nextInt();
            System.out.print("Enter starting column (0-9):");
            startCol= scan.nextInt();

            if(startRow<0 || startRow>9 || startCol<0 || startCol>9){
                System.out.println("Invalid row or column(0-9 only)");
            }else{break;}
        }




        fill(startRow, startCol, matrix);

        display(matrix);

    }


    // Starter function to create the 2D array and fill it with zeros
    public static int[][]  floodFillStart() {
        Scanner kb = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                matrix[x][y] = 0;
            }
        }
        return matrix;
    }

    //function to display the image
    public static void display(int[][] arr)
    {
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                System.out.printf("%4d", arr[x][y]);
            }
            System.out.println();
        }
    }

    private static void fill(int r, int c, int[][] arr)
    {

    }

}
