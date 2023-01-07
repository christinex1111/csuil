public class houseRobber {
    public static int rob(int[] nums) {
        int amount = 0;
        for (int i = 0; i < nums.length; i+=2) {
            amount += nums[i];
        }

        return amount;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}