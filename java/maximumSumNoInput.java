import java.util.HashMap;

public class maximumSumNoInput {
    public static void main(String[] args) {
        int[] nums = {1,2,-3,4};
        HashMap <String, Integer> map = new HashMap<>();
        int sum = 0;
        int firstLargest = nums[0];
        int secondLargest = nums[1];
        int count = 0;

        map.put("positive", count);
        map.put("negative", count);
        map.put("zero", count);

        for (int element = 0; element < nums.length; element++) {
            if (nums[element] > 0) {
                map.put("positive", count++);
            } else if (nums[element] < 0) {
                map.put("negative", count++);
            } else {
                map.put("zero", count++);
            }
        }

        for (int n = 0; n < nums.length; n++) {
            if (nums[n] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[n];
            } else if (nums[n] > secondLargest) {
                secondLargest = nums[n];
            }
        }
        //System.out.println(firstLargest);
        //System.out.println(secondLargest);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                sum += nums[i];
            } else if (map.get("positive") == 1 || map.get("positive") == 0) {
                sum = firstLargest + secondLargest;
            }
        }

        System.out.println(sum);
    }
}