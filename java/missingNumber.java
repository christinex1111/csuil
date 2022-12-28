import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.Integer;
//import java.util.Collections;

public class missingNumber {
    public static void main(String[] args) {
        int n = 1;
        int count = 1;
        int nums[] = {9,6,4,2,3,5,7,0,1};
        //List <Integer> numsDup = new ArrayList <Integer>();

        for (int i = 0; i < nums.length; i++) {
            n = count++;
        }
        //System.out.println(n);
        List <Integer> numsDup = IntStream.range(0,n+1).boxed().collect(Collectors.toList());
        //System.out.println(numsDup);
        

        List <Integer> numsTwo = new ArrayList<>();
        for (int b : nums) {
            numsTwo.add(b);
        }
        //System.out.println(numsTwo);
        
        numsDup.removeAll(numsTwo);
        System.out.println(numsDup);
            /*List <Integer> num = new ArrayList <Integer>(numsTwo);
            num.addAll(numsDup);

            List <Integer> intersection = new ArrayList <Integer>(numsTwo);
            intersection.retainAll(numsDup);

            List <Integer> difference = new ArrayList <Integer>(num);
            difference.removeAll(intersection);

            System.out.println(difference);*/
        }
    }

