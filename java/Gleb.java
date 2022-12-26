import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Gleb {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gleb.dat"));

        List <String> letter = new ArrayList <>();
        List <Integer> num = new ArrayList <Integer>();

        letter.add("A");
        letter.add("B");
        letter.add("C");
        letter.add("D");
        letter.add("E");
        letter.add("F");
        letter.add("G");

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        

        while (in.hasNext()) {
            String c = in.next();
            int n = in.next();
            if (n == 4) {
                
            }
        }
    }
    
}
