import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        HashMap <Integer, Integer> num = new HashMap<>();
        List <Integer> numDuplicates = new ArrayList<>();
        //int numsTwo[] = {};

        for (int element : nums) {
            if (num.get(element) == null) {
                num.put(element, 1);
            } else {
                num.put(element, num.get(element) + 1);
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if (entry.getValue() == 2) {
                numDuplicates.add(entry.getKey());
            }
        }
        
        System.out.println(numDuplicates);
    }
}
