import java.util.ArrayList;
import java.util.Collections;

public class findMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        ArrayList <Integer> numsCop = new ArrayList<>();
        int min = 0;

        for (int element : nums) {
            numsCop.add(element);
        }

        min = Collections.min(numsCop);
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
}