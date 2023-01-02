public class binarySearch {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 2;
        int value = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                value = i;
            }
        }

        System.out.println(value);
    }
}