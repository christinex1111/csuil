import java.util.ArrayList;

public class productOfArrayExceptSelf {
    public static void main(String args[]) {
        int[] nums = {-1,1,0,-3,3};
        int index = 1;
        int benchmark = 0;
        int product = 1;
        ArrayList <Integer> otherNums = new ArrayList<>();
        ArrayList <Integer> listOfProducts = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                while (index < nums.length) {
                    otherNums.add(nums[index]);
                    index++;
                }
                for (int n = 0; n < otherNums.size(); n++) {
                    product *= otherNums.get(n);
                }
                listOfProducts.add(product);
                otherNums.clear();
                product = 1;
            }
            else {
                benchmark = i - 1;
                while (benchmark > -1) {
                    otherNums.add(nums[benchmark]);
                    benchmark--;
                }
                benchmark = i + 1;
                while (benchmark < nums.length) {
                    otherNums.add(nums[benchmark]);
                    benchmark++;
                }
                for (int m = 0; m < otherNums.size(); m++) {
                    product *= otherNums.get(m);
                }
                listOfProducts.add(product);
                otherNums.clear();
                product = 1;
            }
        }
        System.out.println(listOfProducts);
    }
}