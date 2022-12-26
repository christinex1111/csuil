import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Bayani {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("bayani.dat"));
        //char dollar = "$";
        //char dot = ".";
        while(in.hasNext()) {
            double n = in.nextDouble();
            //out.printf(" %d%d%d%d %d%d\n"," ",n,n,n,n," ",n,n);
            out.printf("    $%7.2f\n", n);
        }
    }
}