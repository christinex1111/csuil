import java.util.ArrayList;
import java.util.HashMap;

public class canItBeAPalindrome {
    public static void main(String[] args) {
        String s = "there";
        int counts = 0;
        int counts2 = 0;
        int result = 0;
        //int indexSum = 0;
        HashMap <String, Integer> count = new HashMap<>();
        ArrayList <String> convert = new ArrayList<>();

        for (int n = 0; n < s.length(); n++) {
            convert.add(String.valueOf(s.charAt(n)));
        }
        
        for (String t : convert) {
            if (count.get(t) == null) {
                count.put(t, 1);
            } else {
                count.put(t, count.get(t) + 1);
            }
        }

        /*for (int m = 0; m < convert.size(); m++) {
            indexSum += m;
        }
        indexSum /= convert.size() - 1;*/

        for (java.util.Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 2) {
                counts2++;
            }
        }

        for (java.util.Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                counts++;
            }
        }

        if (counts2 >= 2 || counts == 1 && counts2 >= 1) {
            result += 1;
        } else {
            result += 0;
        }

        System.out.println(result);
    }
}