// taught me how to write a spiral matrix pattern

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Diya3 {
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(new File("diya.dat"));
        
        while(in.hasNext()) {
            int n = in.nextInt();
            int matrix[][] = new int[n][n];
            int startRow = 0, endRow = n-1;
            int startCol = 0, endCol = n-1;
            int num = 1;
            int a = 0, b = 0;
            while (num <= n*n) {
                b = startCol;
                while (b <= endCol) {
                    matrix[startRow][b] = num++;
                    b++;
                }
                startRow++;

                a = startRow;
                while (a <= endRow) {
                    matrix[a][endCol] = num++;
                    a++;
                }
                endCol--;

                b = endCol;
                while (b >= startCol) {
                    matrix[endRow][b] = num++;
                    b--;
                }
                endRow--;

                a = endRow;
                while (a >= startRow) {
                    matrix[a][startCol] = num++;
                    a--;
                }
                startCol++;
            }
            printMatrix(matrix, n, n);
            System.out.println();
            System.out.println("=====");
            System.out.println(" ");
        }
    }

    public static void printMatrix(int[][] matrix, int row, int col) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (c != col-1) {;
                    out.printf("%-5d", matrix[r][c]);
                    //System.out.print(matrix[r][c] + "\t");
                } else {
                    System.out.print(matrix[r][c] + "\n");
                }
            }
        }
    }
}