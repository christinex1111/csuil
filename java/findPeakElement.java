import java.util.ArrayList;

public class findPeakElement {
    public static int findPeakElementIndex(int[] nums) {
        ArrayList <Integer> numsCop = new ArrayList<>();
        int peak = 0;

        for (int element : nums) {
            numsCop.add(element);
        }

        for (int i = 0; i < numsCop.size(); i++) {
            for (int j = i+1; j < numsCop.size(); j++) {
                if (numsCop.get(i) < numsCop.get(j)) {
                    continue;
                } else {
                    peak = i;
                }
            }
        }
        
        return peak;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElementIndex(nums));
    }
}