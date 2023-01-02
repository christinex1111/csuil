import java.util.Collections;
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        HashMap <Integer, Integer> numsMap = new HashMap<>();
        
        for (int element : nums) {
            if (numsMap.get(element) == null) {
                numsMap.put(element, 1);
            } else {
                numsMap.put(element, numsMap.get(element) + 1);
            }
        }

        int max = Collections.max(numsMap.values());
        for (java.util.Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
