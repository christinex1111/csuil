//import java.util.ArrayList;

public class backspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "a#d#";
        //String f = "";
        //int skipOne = 0;
        //int skipTwo = 0;

        for (int i = s.length(); i >= 0; i--) {
            if (s.charAt(i) == '#') {
                i--;
                continue;
            } else {
                s = s.replace(s.charAt(i), ' ');
            }
        }

        for (int j = t.length(); j >= 0; j--) {
            if (t.charAt(j) == '#') {
                j--;
            }
        }

    }
}
