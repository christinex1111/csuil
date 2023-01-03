public class findSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char letters[] = {'x','x','y','y'};
        char target = 'z';
        char printedChar = 'a';

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                printedChar = letters[i];
                break;
            } else {
                printedChar = letters[0];
            }
        }

        System.out.println(printedChar);
    }
}