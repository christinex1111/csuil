import java.util.ArrayList;
import java.util.HashMap;

public class simpleCalculator3 {
    public static void main(String[] args) {
        String q = "0+3-4=";
        //int sum = 0;
        ArrayList <Integer> nums = new ArrayList<>();
        ArrayList <Character> operators = new ArrayList<>();
        HashMap <Character, Integer> convert = new HashMap<>();

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

        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == '+' || q.charAt(i) == '-' || q.charAt(i) == '=') {
                operators.add(q.charAt(i));
            }
        }

        for (int j = 0; j < q.length(); j++) {
            for (java.util.Map.Entry <Character, Integer> entry : convert.entrySet()) {
                if (entry.getKey() == q.charAt(j)) {
                    nums.add(entry.getValue());
                }
            }
        }

        int sum = nums.get(0);
        for (int n = 0; n < operators.size(); n++) {
            if (operators.get(n) == '+') {
                sum += nums.get(n+1);
            } else if (operators.get(n) == '-') {
                sum -= nums.get(n+1);
            } else if (operators.get(n) == '=') {
                break;
            }
        }

        System.out.println(sum);
    }
}