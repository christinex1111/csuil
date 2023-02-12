import java.util.ArrayList;
import java.util.List;

public class countingBits {
    public static int[] countBits(int n) {
        int[] countDup = {};
        List <Integer> count = new ArrayList<>();
        count.add(0);
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            if (pow * 2 == i) {
                pow = i;
            } else {
                count.add(count.get(i - pow));
            }
        }

        for (int j = 0; j < count.size(); j++) {
            countDup[j] = count.get(j);
        }

        return countDup;
    }
    
    public static void main(String[] args) {
        int n = 2;
        System.out.println(countBits(n));
    }
}