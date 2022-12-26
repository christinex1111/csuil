import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Kinga2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("kinga.dat"));

        List <String> letters = new ArrayList <String>();
        List <String> alpha = new ArrayList <String>();
        List <Integer> binaryNums = new ArrayList <Integer>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");

        while (in.hasNextInt()) {
            int n = in.nextInt();

            double total = Math.pow(2, n);
            int compare = 1;
            int iterate = 0;
            int num = 0;
            while (iterate++ <= total) {
                for (int i = 1; i <= n; i++) {
                    compare <<= i;
                    if (num != 0) {
                        binaryNums.add(0);
                    } else {
                        binaryNums.add(1);
                    }
                    }
                    
                    for (int b = 0; b < letters.size(); b++) {
                        alpha = letters.subList(0, n+1);
                        for (int a = 0; a < alpha.size(); a++) {
                            String alphaLetters = alpha.get(a);
                            if (a != n) {
                                System.out.print(" " + alphaLetters + "|");
                            } else {
                                break;
                            }
                        }
                    }
                    for (int i= 1; i <= n; i++) {
                        System.out.print(1 + " ");
                        if (i != n) {
                            System.out.print(binaryNums + "|");
                        } else {
                            for (int c = 1; c <= iterate; c++) {
                                System.out.print("\n" + c + " ");
                            }
                        }
                    }
                }
            }
        }
    }

