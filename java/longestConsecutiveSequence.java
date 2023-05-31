import java.util.ArrayList;
import java.util.Collections;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        ArrayList <Integer> numsList = new ArrayList<>();
        int count = 1;
        ArrayList <Integer> counts = new ArrayList<>();

        for (int a = 0; a < nums.length; a++) {
            numsList.add(nums[a]);
        }
        Collections.sort(numsList);

        int i = 0;
        for (int j = i + 1; j < numsList.size(); j++) {
            if (numsList.get(j) - numsList.get(i) == 1) {
            count++;
            i++;
            } else {
            counts.add(count);
            count = 1;
            i++;
            }
        }
        counts.add(count);
        System.out.println(Collections.max(counts));
    }
}
