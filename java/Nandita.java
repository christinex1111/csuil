// taught me how to do hashmaps

import java.util.*;
import java.util.HashMap.*;
import java.io.*;
import static java.lang.System.*;

public class Nandita {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("nandita.dat"));

        HashMap<String, Integer> map = new HashMap <>();

        map.put("JANUARY", 1);
        map.put("FEBRUARY", 2);
        map.put("MARCH", 3);
        map.put("APRIL", 4);
        map.put("MAY", 5);
        map.put("JUNE", 6);
        map.put("JULY", 7);
        map.put("AUGUST", 8);
        map.put("SEPTEMBER", 9);
        map.put("OCTOBER", 10);
        map.put("NOVEMBER", 11);
        map.put("DECEMBER", 12);
        //while (in.hasNext()) {
        /*String given = in.next();
        int month = 0;

            // or use a HashMap
        if (given == "JANUARY") {
            month += 1;
        }
        if (given == "FEBRUARY") { 
            month += 2;
        }
        if (given == "MARCH") {
            month += 3;
        }
        if (given == "APRIL") {
            month += 4;
        }
        if (given == "MAY") {
            month += 5;
        }
        if (given == "JUNE") {
            month += 6;
        }
        if (given == "JULY") {
            month += 7;
        }
        if (given == "AUGUST") {
            month += 8;
        }
        if (given == "SEPTEMBER") {
            month += 9;
        }
        if (given == "OCTOBER") {
            month += 10;
        }
        if (given == "NOVEMBER") {
            month += 11;
        }
        if (given == "DECEMBER") {
            month += 12;
        }*/

        while (in.hasNext()) {
            String m = in.next();
            String d = in.next();
            String y = in.next();

            int month = map.get(m);
            int day = Integer.parseInt(d.substring(0, d.length()-1));

            out.printf("%02d/%02d/%s\n", month, day, y.substring(2));
            out.printf("%02d.%02d.%s\n", day, month, y.substring(2));
            out.printf("%s-%02d-%02d\n", y.substring(2), month, day);
            System.out.println("=====");

        

        }
    }
}
