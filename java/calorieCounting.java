import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class calorieCounting {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("calorieCounting.dat"));
        
        while (in.hasNextLine()) {
            String calorie = in.nextLine();
            String[] calories = calorie.split("\n");
            System.out.println(calories);
        }
    }
}
