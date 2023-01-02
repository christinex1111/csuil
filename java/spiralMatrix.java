import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int iterate = 1;
        List <Integer> finalMat = new ArrayList<>();
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int max = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        //System.out.println(max);
        
        int startRow = 0;
        int endRow = 2;
        int startCol = 0;
        int endCol = 2;
        int r = 0; int c = 0;

        while (iterate <= max) {
            c = startCol;
            while (c <= endCol) {
                matrix[startRow][c] = iterate++;
                c++;
                finalMat.add(c);
            }
            startRow++;
            //finalMat.add(c);

            r = startRow;
            while (r <= endRow) {
                matrix[r][endCol] = iterate++;
                r++;
                //finalMat.add(endCol);
            }
            endCol--;
            finalMat.add(endRow);

            c = endCol;
            while (c >= startCol) {
                matrix[endRow][c] = iterate++;
                c--;
                finalMat.add(iterate);
            }
            endRow--;
            //finalMat.add(iterate);

            r = endRow;
            while (r >= startRow) {
                matrix[r][startCol] = iterate++;
                r--;
                finalMat.add(iterate);
            }
            startCol++;
            //finalMat.add(iterate);
        }
        System.out.println(finalMat);

        /*for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                System.out.print(matrix[m][n] + " ");
            }
            System.out.println();
        }*/
    }
}