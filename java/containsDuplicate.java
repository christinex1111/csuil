public class containsDuplicate {
    public static void main(String[] args) {
        boolean booleanCheck = false;
        //int n = 0;
        int nums[] = {1,2,3,1};
        
        for (int i = 0; i < nums.length; i++) {
            for (int n = i + 1; n < nums.length; n++) {
                if (nums[i] == nums[n]) {
                    booleanCheck = true;
                }
            }
        }
        System.out.println(booleanCheck);
    }
}

