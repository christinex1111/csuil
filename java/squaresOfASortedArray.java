import java.util.ArrayList;
import java.util.Collections;

public class squaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        ArrayList <Integer> numSquares = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
            numSquares.add(nums[i]);
        }

        Collections.sort(numSquares);
        System.out.println(numSquares);

    }
}