import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class maximumSum {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("maximumSum.dat"));

        while (in.hasNextLine()) {
            int n = in.nextInt();
            int size = in.nextInt(0);
            System.out.println(size);
        }
    }
}