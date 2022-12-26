public class Example3 {
    public static void main(String args[]) {
        int v; // this declares an integer variable
        double x; // this declares a floating-pt variable

        v = 10;
        x = 10.0;

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);
        System.out.println(); // prints a blank line

        // nxt sect. divides both by 4
        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);

    }    
}
