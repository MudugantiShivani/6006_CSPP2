import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * {private class also called constructor}.
         */
    }
    /**
     * {main function which prints the reverse of a string}.
     *
     * @param      args string data type
     */
    public static void main( final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverseerse = reverseerseString(s);
        System.out.println(reverseerse);
    }
    /**
     * {This is the function where we write code for reverse of string}.
     *
     * @param      reverse data type is int and reverse of the string is stored
     *
     * @return     { returns the reversed string }
     */
    static String reverseerseString(final String reverse) {
        String result = "";
        char[] array1 = reverse.toCharArray();
        int len = reverse.length();
        for (int k = len - 1; k >= 0; k--) {
            result += array1[k];
        }
        return result;
    }
}
