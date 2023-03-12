import java.util.ArrayList;
import java.util.HashMap;

public class oneUp {
    public static void main (String[] args) {
        String n = "109";
        ArrayList <Character> digits = new ArrayList<>();
        ArrayList <Integer> newDigits = new ArrayList<>();
        HashMap <Character, Integer> convert = new HashMap<>();

        for (int i = 0; i < n.length(); i++) {
            digits.add(n.charAt(i));
        }

        convert.put('0', 0);
        convert.put('1', 1);
        convert.put('2', 2);
        convert.put('3', 3);
        convert.put('4', 4);
        convert.put('5', 5);
        convert.put('6', 6);
        convert.put('7', 7);
        convert.put('8', 8);
        convert.put('9', 9);

        for (int j = 0; j < digits.size(); j++) {
            for (java.util.Map.Entry <Character, Integer> entry : convert.entrySet()) {
                if (entry.getKey() == digits.get(j)) {
                    newDigits.add(entry.getValue());
                }
            }
        }

        newDigits.set(newDigits.size()-1, newDigits.get(newDigits.size()-1) + 1);

        int finalNum = 0;
        for (int iterator = 0; iterator < newDigits.size(); iterator++) {
            finalNum = finalNum * 10 + newDigits.get(iterator);
        }

        System.out.println(finalNum);
    }
}