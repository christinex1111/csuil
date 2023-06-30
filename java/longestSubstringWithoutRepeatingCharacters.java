import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        //String substring = "";
        String possibles = "";
        ArrayList <String> listOfStrings = new ArrayList<>();
        ArrayList <Integer> length = new ArrayList<>();
        //ArrayList <Integer> counts = new ArrayList<>();
        //HashMap <Character, Integer> count = new HashMap<>();

        int i = 0;
        for (int j = 1; j < s.length(); j++) {
            possibles += s.charAt(i);
            i++;
            if (possibles.contains(Character.toString(s.charAt(j)))) {
                listOfStrings.add(possibles);
                possibles = "";
            }
        }
        
        for (String element : listOfStrings) {
            length.add(element.length());
        }
        int max = Collections.max(length);

        return max;
    }  


    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}