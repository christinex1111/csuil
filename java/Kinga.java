import java.util.*;
import java.io.*;
import static java.lang.System.*;
//import java.util.List.*;

public class Kinga {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(new File("kinga.dat"));

        List <String> alpha = new ArrayList <String>();
        HashMap<Integer, Integer> map = new HashMap<>();
        List <String> letters = new ArrayList <String>();

        alpha.add("A");
        alpha.add("B");
        alpha.add("C");
        alpha.add("D");
        alpha.add("E");
        alpha.add("F");
        alpha.add("G");
        alpha.add("H");
        alpha.add("I");

        map.put(1,2);
        map.put(2,6);
        map.put(3,14);
        map.put(4,30);
        map.put(5,62);
        map.put(6,126);
        map.put(7,254);
        map.put(8,510);
        map.put(9,1022);

        while (in.hasNextInt()) {
            //String finalProduct = " ";
            int n = in.nextInt();

            for (int i = 0; i < alpha.size(); i++) {
                letters = alpha.subList(0, n+1);
            }

            for (Integer j = 0; j < letters.size(); j+=2) {
                String originalInteger = j.toString();
                String[] binaryInteger = originalInteger.split(" ");
                for (int a = 0; a < binaryInteger.length; a++) {
                    String binaryResultFirst = Integer.toBinaryString(a);
                    String[] binaryResult = binaryResultFirst.split(" ");
                    for (int k = 0; k < binaryResult.length; k+=3) {
                        //out.printf()
                    }
                }
            }
            //System.out.print(letters);
        }
    }
}