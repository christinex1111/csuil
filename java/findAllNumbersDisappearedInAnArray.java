import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int nums[] = {1,1};
        int count = 0;
        int range = 0;

        List <Integer> numsDup = new ArrayList<>();
        for (int a : nums) {
            numsDup.add(a);
        }
        //System.out.println(numsDup);

        for (int i = 0; i <= numsDup.size(); i++) {
            range = count+i;
        }
        //System.out.println(range);
        List <Integer> numsSecond = IntStream.range(1,range+1).boxed().collect(Collectors.toList());
        //System.out.println(numsSecond);

        numsSecond.removeAll(numsDup);
        System.out.println(numsSecond);
    }
}
