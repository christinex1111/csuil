// taught me how to write a spiral matrix pattern

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Diya2 {
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
            int startRow = 0, endRow = n;
            int startCol = 0, endCol = n;
            while (num <= n*n) {
                while (startRow <= endRow-1 && startCol <= endCol-1) {
                    for (int i = startCol; i <= endCol-1; i++) {
                        matrix[startRow][i] = i++;
                    }
                    startRow++;

                    for (int i = startRow; i <= endRow; i++) {
                        matrix[i][endCol-1] = i++;
                    }
                    endCol--;
                }

                if (startRow <= endRow) {
                    for (int i = endCol-1; i >= startCol; i--) {
                        matrix[endRow][i] = i--;
                    }
                    endRow--;
                }

                if (startCol <= endCol-1) {
                    for (int i = endRow; i >= startRow; i--) {
                        matrix[i][startCol] = i--;
                    }
                    startCol++;
                }
            }
            printMatrix(matrix, num, num);
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

