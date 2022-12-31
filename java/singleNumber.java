//import java.security.KeyStore.Entry;
import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        //int value = 1;
        HashMap <Integer, Integer> numsMap= new HashMap<>();
        //System.out.println(nums.length);

        for (int i : nums) {
            if (numsMap.get(i) == null) {
                numsMap.put(i,1);
            } else {
                numsMap.put(i, numsMap.get(i)+1);
            }
        }
        //System.out.println(numsMap);

        for (java.util.Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
    }
}
}