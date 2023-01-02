import java.util.HashMap;

public class containsDuplicate2 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        boolean booleanCheck = false;
        HashMap <Integer, Integer> numsMap = new HashMap<>();

        for (int element : nums) {
            if (numsMap.get(element) == null) {
                numsMap.put(element, 1);
            } else {
                numsMap.put(element, numsMap.get(element) + 1);
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 2) {
                booleanCheck = true;
            }
        }

        System.out.println(booleanCheck);
    }
}