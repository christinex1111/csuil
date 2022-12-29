import java.util.ArrayList;
/*import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;*/

public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
            
        /*int max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
            }
        }*/

        int min = prices[0];
        for (int n = 0; n < prices.length; n++) {
            if (min > prices[n]) {
                min = prices[n];
            }
        }
        //System.out.println(min);
         
        int finalNum = 0;
        ArrayList <Integer> pricesDup = new ArrayList<>();
        for (int a : prices) {
            pricesDup.add(a);
        }
        int minIndex = pricesDup.indexOf(min);
        pricesDup.subList(0, minIndex).clear();
                
        //System.out.println(pricesDup);
        //System.out.println(min);

        int max = pricesDup.get(0);
        for (int i = 0; i < pricesDup.size(); i++) {
            if (max < pricesDup.get(i)) {
                max = pricesDup.get(i);
                finalNum = max - min;
                //System.out.println(max);
                //System.out.println(finalNum);
            } else if (max == pricesDup.get(i)) {
                finalNum = 0;
            }
            //System.out.println(max);
            //System.out.println(finalNum);
        }
        System.out.println(finalNum);
    }
}