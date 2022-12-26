// taught me how to write a spiral matrix pattern

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Diya {
    public static void main(String[] args) throws IOException {
        
        //int[][] chess = new int[3][3];
        //printMatrix(chess, 3, 3);
        
        int num = 1;
        //int startRow = 0, endRow = n;
        //int startCol = 0, endCol = n;
        Scanner in = new Scanner(new File("diya.dat"));
        
        while(in.hasNext()) {
            int n = in.nextInt();
            int matrix[][] = new int[n][n];
            int startRow = 0, endRow = n-1;
            int startCol = 0, endCol = n-1;
            while (num <= n*n) {
                while (startRow <= endRow && startCol <= endCol-1) {
                    for (int i = startCol; i <= endCol-1;) {
                        matrix[startRow][i] = i++;
                    }
                    startRow++;

                    for (int i = startRow; i <= endRow-1;) {
                        matrix[i][endCol-1] = i++;
                    }
                    endCol--;
                }

                if (startRow <= endRow) {
                    for (int i = endCol-1; i >= startCol;) {
                        matrix[endRow-1][i] = i--;
                    }
                    endRow--;
                }

                if (startCol <= endCol) {
                    for (int i = endRow-1; i >= startRow;) {
                        matrix[i][startCol-1] = i--;
                    }
                    startCol++;
                }
            }
            printMatrix(matrix, n, n);
        }
        //printMatrix(matrix, num, num);
        System.out.println();
        System.out.print("=====");
        //System.out.print(mat);
    }

    public static void printMatrix(int[][] mat, int row, int col) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (c != col - 1) {
                    System.out.print(mat[r][c] + " ");
                } else {
                    System.out.print(mat[r][c] + "\n");
                }
            }
        }
    }

}
