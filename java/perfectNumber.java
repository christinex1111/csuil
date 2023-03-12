public class perfectNumber {
    public static void main(String[] args) {
        int input = 12;
        int sum = 0;

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }

        if (sum == input) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}