import java.util.ArrayList;

public class searchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        boolean result = false;
        ArrayList <Integer> numsCop = new ArrayList<>();

        for (int element : nums) {
            numsCop.add(element);
        }

        if (numsCop.contains(target)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search(nums, 3));
    }
}

