import java.util.Scanner;
/**
 * { program to convert binary to decimal}.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * {private constructor}.
         */
    } 
    /**
     * { function_description }.
     *
     * @param      s     { string data type }
     *
     * @return     {returns the decimal number}
     */
    static long binaryToDecimal(final String s) {
        long binarynum = Long.parseLong(s);
        int b = 0;
        final int ten = 10;
        long result = 0;
        long num = binarynum;
        while (num > 0) {
            long num1 = num % ten;
            result += num1 * Math.pow(2, b);
            num = num / ten;
            b = b + 1;
        }
        return result;
    }
    /**
     * { main function }.
     *
     * @param      args  string data type
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            long res = binaryToDecimal(s);
            System.out.println(res);
        }
    }

}