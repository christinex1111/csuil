import java.util.ArrayList;
import java.util.List;

public class twoSum {
    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;
        int sum = 0;
        List <Integer> indices = new ArrayList<>();
        //List <Integer> numsDup = new ArrayList<>();

        /*for (int n : nums) {
            numsDup.add(n);
        }*/

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                //System.out.println(sum);
                if (sum == target) {
                    indices.add(i);
                    indices.add(j);
                }
            }
        }

        System.out.println(indices);
    }
}
