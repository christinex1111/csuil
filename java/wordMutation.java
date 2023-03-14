import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class wordMutation {
    public static void main(String[] args) {
        String[] words = {"blue", "cars", "mars"};
        ArrayList <String> reorder = new ArrayList<>();
        ArrayList <String> contain = new ArrayList<>();
        HashMap <String, Integer> record = new HashMap<>();
        HashMap <String, Integer> contains = new HashMap<>();
        HashMap <String, Integer> finalMap = new HashMap<>();
        int count = 0;
        int counts = 0;
        int countss = 0;
        int zeroCount = 0;
        int numCount = 0;
        String smallest = " ";

        for (int n = 0; n < words.length-1; n++) {
            if (words[n].compareTo(words[n+1]) > 0) {
                smallest = words[n+1];
            } else {
                smallest = words[n];
            }
        }
        //System.out.println(smallest);
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                for (int m = 0; m < words[i].length(); m++) {
                    inner: for (int n = m; n < words[j].length(); n++) {
                        if (words[i].charAt(m) == words[j].charAt(n)) {
                            count++;
                            break inner;
                        }
                    }
                }
            }
            record.put(words[i], count);
            count = 0;
        }
        //System.out.println(record);

        int min1 = Collections.min(record.values());
        int max1 = Collections.max(record.values());
        for (java.util.Map.Entry<String, Integer> entry : record.entrySet()) {
            if (entry.getValue() == min1 && entry.getKey() == smallest) {
                reorder.add(entry.getKey());
            } else if (entry.getValue() == min1) {
                reorder.add(entry.getKey());
            }
        }
        //System.out.println(reorder);
        
        for (java.util.Map.Entry<String, Integer> entry : record.entrySet()) {
            if (entry.getValue() == max1) {
                contain.add(entry.getKey());
                for (int n = 0; n < contain.size(); n++) {
                    for (int o = 0; o < reorder.get(0).length(); o++) {
                        outer: for (int p = o; p < contain.get(n).length(); p++) {
                            if (reorder.get(0).charAt(o) == contain.get(n).charAt(p)) {
                                counts++;
                                break outer;
                            }
                        }
                    }
                    contains.put(contain.get(n), counts);
                    counts = 0;
                }

            }
        }
        int min2 = Collections.min(contains.values());
        int max2 = Collections.max(contains.values());
        for (java.util.Map.Entry<String, Integer> entry : contains.entrySet()) {
            if (entry.getValue() == max2) {
                reorder.add(entry.getKey());
            }
            if (entry.getValue() == min2) {
                reorder.add(entry.getKey());
            }
        }

        for (int a = 0; a < words.length; a++) {
            if (!reorder.contains(words[a])) {
                reorder.add(words[a]);
            } 
        }

        for (int b = 0; b < reorder.size(); b++) {
            outerLoop: for (int c = b + 1; c < reorder.size();) {
                for (int m = 0; m < reorder.get(b).length(); m++) {
                    loop: for (int n = m; n < reorder.get(c).length(); n++) {
                        if (reorder.get(b).charAt(m) == reorder.get(c).charAt(n)) {
                            countss++;
                            break loop;
                        }
                    }
                }
                break outerLoop;
            }
            finalMap.put(reorder.get(b), countss);
            countss = 0;
        }

        int min3 = Collections.min(finalMap.values());
        int max3 = Collections.max(finalMap.values());
        for (java.util.Map.Entry<String, Integer> entry : finalMap.entrySet()) {
            if (entry.getValue() == min3) {
                zeroCount++;
            } else if (entry.getValue() == max3) {
                numCount++;
            }
        }

        if (zeroCount == 1 && numCount == reorder.size()-1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}