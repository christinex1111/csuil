import java.util.ArrayList;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int index = 0;
        ArrayList <Integer> numsCop = new ArrayList<>();

        for (int element : nums) {
            numsCop.add(element);
        }

        if (numsCop.contains(target)) {
            index = numsCop.indexOf(target);
        } else {
            index = -1;
        }
        
        System.out.println(index);
    }
}
