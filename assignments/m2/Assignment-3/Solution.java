import java.util.Scanner;
/**
 * { item_description }.
 */

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * {This is the function where we write take the inputs}.
     *
     * @param      args  type is string
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
     * {recursion function for power}.
     *
     * @param      b     {type int }.
     * @param      e     {type int}.
     *
     * @return     { returns the power }.
     */
    public static long power(final int b, final int e) {
        if (e != 0) {
            return (b * power(b, e - 1));
        } else {
            return 1;
        }
    }
}

