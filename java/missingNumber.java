import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.Integer;

public class missingNumber {
    public static void main(String[] args) {
        int n = 1;
        int count = 1;
        int nums[] = {9,6,4,2,3,5,7,0,1};

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
        }
    }

