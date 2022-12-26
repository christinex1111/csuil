import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Raymond {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("raymond.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            out.printf("%d %d\n",n, ~n);
        }
    }
}