import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class removeDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] head = {1,1,2,3,3};
        //int[] num = {};
        HashMap <Integer, Integer> numsMap = new HashMap<>();
        ArrayList <Integer> nums = new ArrayList<>();

        for (int element : head) {
            if (numsMap.get(element) == null) {
                numsMap.put(element, 1);
            } else {
                numsMap.put(element, numsMap.get(element) + 1);
            }
        }

        for (java.util.Map.Entry <Integer, Integer> entry : numsMap.entrySet()) {
            nums.add(entry.getKey());
        }
        
        Collections.sort(nums);
        System.out.println(nums);
    }
}
