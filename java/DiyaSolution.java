import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class DiyaSolution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("diya.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            int[][] mat = new int[n][n]; // [rows][cols]
            int top = 0, bot = n-1, lt = 0, rt = n-1;

            int i = 1;
            int r = 0, c = 0;
            while(i <= n*n) {

                c = lt;
                while(c <= rt) {
                    mat[top][c] = i++;
                    c++;
                }
                top++;

                r = top;
                while(r <= bot) {
                    mat[r][rt] = i++;
                    r++;
                }
                rt--;

                c = rt;
                while(c >= lt) {
                    mat[bot][c] = i++;
                    c--;
                }
                bot--;

                r = bot;
                while(r>=top) {
                    mat[r][lt] = i++;
                    r--;
                }
                lt++;

            }

            int largest = Integer.toString(n*n).length();

            for(int[] row:mat) {
                for(int num : row) {
                    out.printf("%-" + largest + "d ",num);
                }
                out.println();
            }
            out.println("=====");

        }
    }
}