import java.util.*;
import java.io.*;
import static java.lang.System.*;

import java.util.ArrayList.*;
/*import java.util.Arrays.*;
import java.util.Collections.*;
import java.util.List.*;*/

public class Gleb2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gleb.dat"));

        List <String> notes = new ArrayList <String>();
        //List <Integer> elements = new ArrayList <Integer>();

        notes.add("A0");
        notes.add("B0");
        notes.add("C1");
        notes.add("D1");
        notes.add("E1");
        notes.add("F1");
        notes.add("G1");
        notes.add("A1");
        notes.add("B1");
        notes.add("C2");
        notes.add("D2");
        notes.add("E2");
        notes.add("F2");
        notes.add("G2");
        notes.add("A2");
        notes.add("B2");
        notes.add("C3");
        notes.add("D3");
        notes.add("E3");
        notes.add("F3");
        notes.add("G3");
        notes.add("A3");
        notes.add("B3");
        notes.add("C4");
        notes.add("D4");
        notes.add("E4");
        notes.add("F4");
        notes.add("G4");
        notes.add("A4");
        notes.add("B4");
        notes.add("C5");
        notes.add("D5");
        notes.add("E5");
        notes.add("F5");
        notes.add("G5");
        notes.add("A5");
        notes.add("B5");
        notes.add("C6");
        notes.add("D6");
        notes.add("E6");
        notes.add("F6");
        notes.add("G6");
        notes.add("A6");
        notes.add("B6");
        notes.add("C7");
        notes.add("D7");
        notes.add("E7");
        notes.add("F7");
        notes.add("G7");
        notes.add("A7");
        notes.add("B7");
        notes.add("C8");
        //System.out.print(notes);

        while (in.hasNextLine()) {
            String n = in.nextLine();
            String finalNotes = " ";
            //String d = "";
            String[] indEle = n.split(" ");
            int elemIndex = 0;

            for (int i = 0; i < indEle.length; i++) {
                //int note = indEle[i];
                if (i == 0) {
                    elemIndex = notes.indexOf(indEle[0]);               
                }
                else {
                    int t = Integer.parseInt(indEle[i]);
                    if (t > 0) {
                        t -= 1;
                    }
                    else if (t < 0) {
                        t += 1;
                    }
                    elemIndex += t;
                }
                finalNotes += notes.get(elemIndex) + " ";
            }

            System.out.println(finalNotes);
            //int j = Integer.parseInt(n.substring(2, n.length()-1)); 

            /*if (n < 0) {
                Collections.reverse(notes);
            }*/

            /*for (int i = 1; i < n.length(); i++) {
                a += j;
                b += a;
            }

            for (int k = 0; k < b.length(); k++) {
                int m = Integer.parseInt(b);
                elements.add(m);
                Integer[]e = new Integer[elements.size()];
                elements.toArray(e);
                d += e[k];
            }

            System.out.println(d);*/
        }

    }
}
