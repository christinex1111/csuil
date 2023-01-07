//import java.util.ArrayList;
//import java.util.List;

public class climbingStairs {
    public static int climbStairs(int n) {
       if (n <= 2) {
            return n;
        } 

        return climbStairs(n-2) + climbStairs(n-1);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}