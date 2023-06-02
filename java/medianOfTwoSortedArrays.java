import java.util.ArrayList;
import java.util.Collections;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        ArrayList <Integer> numsComb = new ArrayList<>();
        double i = 0.0;
        double median = 0.0;
        
        for (int element : nums1) {
            numsComb.add(element);
        }
        for (int ele : nums2) {
            numsComb.add(ele);
        }
        Collections.sort(numsComb);

        double mod = numsComb.size() % 2;
        if (mod != 0) {
            i = Math.floor(mod);
            int index = (int)i;
            median = numsComb.get(index);
        } else {
            int index = numsComb.size() / 2;
            double first = numsComb.get(index);
            double second = numsComb.get(index-1);
            median = (first + second) / 2;
        }
        System.out.printf("%.5f", median);
    }
}
