import java.util.HashMap;

public class findTheDuplicateNumber {
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        HashMap <Integer, Integer> num = new HashMap<>();

        for (int element : nums) {
            if (num.get(element) == null) {
                num.put(element, 1);
            } else {
                num.put(element, num.get(element) + 1);
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}