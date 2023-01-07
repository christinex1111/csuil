import java.util.ArrayList;
import java.util.List;

public class countingBits {
    public static int[] countBits(int n) {
        List <String> count = new ArrayList<>();
        int remainder;
        int j;
        if (n <= 1) {
            count.add(Integer.toString(n));
        }

        for (int i = 2; i <= n; i++) {
            count.add(Integer.toBinaryString(i));
        }

        while (count.get(j) > 0) {
            for (int j = 0; j < count.get(element).length(); j++) {
                if ()
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 2;
    }
}