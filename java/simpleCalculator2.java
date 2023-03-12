import java.util.ArrayList;
import java.util.HashMap;

public class simpleCalculator2 {
    public static void main(String[] args) {
        String q = "1+6+2-3+0=";
        String sum = " ";
        String u = " ";
        //String[] split = q.split(' ');
        ArrayList <String> nums = new ArrayList<>();
        HashMap <Character, String> convert = new HashMap<>();

        for (int j = 0; j >= 0 && j <= 9; j++) {
            u += j;
        }

        convert.put('0', "0");
        convert.put('1', "1");
        convert.put('2', "2");
        convert.put('3', "3");
        convert.put('4', "4");
        convert.put('5', "5");
        convert.put('6', "6");
        convert.put('7', "7");
        convert.put('8', "8");
        convert.put('9', "9");

        for (int i = 0; i < q.length(); i++) {
            //for (int l = 0; l < u.length(); l++) {
                //if (q.charAt(i) == u.charAt(l)) {
                    for (java.util.Map.Entry <Character, String> entry : convert.entrySet()) {
                        if (entry.getKey() == q.charAt(i)) {
                            if (i > 0) {
                                nums.add(" ");
                            }
                            nums.add(entry.getValue());
                        }
                    }
                }
            //}
        //}
        //System.out.println(split[0]);
        
        
        /*for (int w = 0; w < split.length; w++) {
            System.out.println(split[w]);
        }*/

        for (int n = 1; n < q.length(); n+=2) {
            outer: for (int m = 1; m < nums.size(); m++) {
                if (q.charAt(n) == '+') {
                    nums.set(n-1, "" + Integer.parseInt(nums.get(n-1)));
                    nums.set(n, "" + Integer.parseInt(nums.get(n)));
                    sum = nums.get(n-1) + nums.get(n);
                    System.out.println(sum);
                    //break outer;
                } /*else if (q.charAt(n) == '-') {
                    sum = nums.get(n-1) - nums.get(n);
                    //break outer;
                } else if (q.charAt(n) == '=') {
                    break;
                }*/
            }
        }

        //System.out.println(nums);
    }
}
