// change if statements to switch-case-break in order for the program to run all conditionals
// it is simply running the if (c == 'D') atm

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Carla {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carla.dat"));
        String[] rwx = {"---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx"};

        while (in.hasNext()) {
            String output = "";
            String code = in.next();
            char c = code.charAt(0);
            //String s = Character.toString(c);
            if (c == 'D') {
                output += "d";
            if (c == 'F')
                output += "-";
            if (c == 'L')
                output += "l";
            }

        for(char i = 1; i <= 3; i++) {
            //int getIndex = Arrays.asList(rwx).indexOf(i);
            int num = Integer.parseInt(code.substring(i,i+1));
            //System.out.println(output + getIndex);
            output += rwx[num];
        } 
        System.out.println(output);

        }
    }
    
}
