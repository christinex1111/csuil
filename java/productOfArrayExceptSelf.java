import java.util.ArrayList;
import java.util.List;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int numIndex = 0;
        int product = 1;
        List <Integer> answer = new ArrayList<>();

        List <Integer> numsDup = new ArrayList<>();
        for (int n = 0; n < nums.length; n++) {

        }
        //System.out.println(numsDup);
        /*for (int i = 0; i < numsDup.size(); i++) {
            numIndex = numsDup.indexOf(i);
            numsDup.remove(numIndex);
            product *= numsDup.get(i);
            answer.add(product);
        }

        System.out.println(answer);*/
    }
}