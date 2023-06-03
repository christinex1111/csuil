import java.util.ArrayList;
import java.util.Collections;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        ArrayList <Integer> numsList = new ArrayList<>();
        ArrayList <Integer> range = new ArrayList<>();
        int max = 0;
        int missing = 0;

        for (int element : nums) {
            if (element > 0) {
                numsList.add(element);
            }
        }
        Collections.sort(numsList);
        max = Collections.max(numsList);
        int lastInd = numsList.size()-1;

        for (int j = 1; j <= max; j++) {
            range.add(j);
        }

        boolean check = numsList.equals(range);
        if (check == true && numsList.contains(1)) {
            missing = (numsList.get(lastInd))+1;
        } else if (check == false && numsList.contains(1)){
            range.removeAll(numsList);
            missing = Collections.min(range); 
        } else {
            missing = 1;
        }

        System.out.println(missing);
    }
}
