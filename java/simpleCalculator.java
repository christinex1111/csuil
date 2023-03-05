import java.util.ArrayList;

public class simpleCalculator {
    public static void main(String[] args) {
        String e = "1+6+2-3+0=";
        char[] convert = e.toCharArray();
        ArrayList <String> range = new ArrayList<>();
        System.out.println(convert);

        for (int j = 0; j <= 9; j++) {
            range.add(Integer.toString(j));
        }

        /*for (int k = 0; k < range.size(); k++) {
            for (int i = 0; i < convert.length; i++) {
                if (convert[i] == range.get(k)) {
                    //convert[i] = Integer.valueOf(convert[i]);
                }
            }
        }*/
    }
}