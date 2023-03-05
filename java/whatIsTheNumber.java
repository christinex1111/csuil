import java.util.ArrayList;
import java.util.HashMap;

public class whatIsTheNumber {
    public static void main(String[] args) {
        HashMap <Character, Character> phone = new HashMap<>();
        ArrayList <Character> conversion = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        String p = "1-800-AIRLINE";
        String f = " ";
        String a = " ";
        
        phone.put('A', '2');
        phone.put('B', '2');
        phone.put('C', '2');
        phone.put('D', '3');
        phone.put('E', '3');
        phone.put('F', '3');
        phone.put('G', '4');
        phone.put('H', '4');
        phone.put('I', '4');
        phone.put('J', '5');
        phone.put('K', '5');
        phone.put('L', '5');
        phone.put('M', '6');
        phone.put('N', '6');
        phone.put('O', '6');
        phone.put('P', '7');
        phone.put('Q', '7');
        phone.put('R', '7');
        phone.put('S', '7');
        phone.put('T', '8');
        phone.put('U', '8');
        phone.put('V', '8');
        phone.put('W', '9');
        phone.put('X', '9');
        phone.put('Y', '9');
        phone.put('Z', '9');

        for (int i = 0; i < p.length(); i++) {
            conversion.add(p.charAt(i));
        }

        for (char l = 'A'; l <= 'Z'; l++) {
            a += l;
        }
        //System.out.println(a);

        for (int n = 6; n < conversion.size(); n++) {
            outer: for (int j = 1; j < a.length(); j++) {
                if (conversion.get(n) == a.charAt(j)) {
                    for (java.util.Map.Entry <Character, Character> entry : phone.entrySet()) {
                        if (entry.getKey() == a.charAt(j)) {
                            conversion.set(n, entry.getValue());
                        //System.out.println(conversion);
                            break outer;
                        }
                    }
                }      
            }
        }

        //System.out.println(conversion);

        for (char c : conversion) {
            sb.append(c);
        }
        f = sb.toString();

        System.out.println(f);
    }
}
