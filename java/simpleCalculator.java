import java.util.ArrayList;
import java.util.List;

public class simpleCalculator {
    public static void main(String[] args) {
        String e = "1+6+2-3+0=";
        String[] convert = e.split("");
        int sum = 0;
        List <Object> convert2 = new ArrayList<Object>();
        ArrayList <String> range = new ArrayList<>();
        //System.out.println(convert[1]);

        for (int n = 0; n < convert.length; n++) {
            convert2.add(convert[n]);
        }
        //System.out.println(convert2.get(3));

        for (int j = 0; j <= 9; j++) {
            range.add(Integer.toString(j));
        }

        for (int k = 0; k < range.size(); k++) {
            for (int i = 0; i < convert.length; i++) {
                if (convert[i] == range.get(k)) {
                    convert2.set(i, Integer.parseInt(convert[i]));
                }
            }
        }
        //System.out.println(Object.assign(convert2.get(2), convert2.get(2)));

        for (int m = 0; m < convert2.size(); m++) {
            if (convert2.get(m) == "+") {
                convert2.set(m-1, ((Number) (convert2.get(m-1))).intValue());
                convert2.set(m+1, ((Number) (convert2.get(m+1))).intValue());
                sum = convert2.get(m-1) + convert2.get(m+1);
            }
        }
    }
}