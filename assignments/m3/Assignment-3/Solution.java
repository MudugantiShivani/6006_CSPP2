
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { this is a constructor}.
         */
    }
    /**
     * {this is the main function where we declare values}.
     *
     * @param      args  String type
     */

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println(gcd);
    }
    /**
     * { function to find GCD of two numbers}.
     *
     * @param      i     { int data type }
     * @param      j     { int data type }
     *
     * @return     { value of the function is returned }
     */
    public static int gcd(final int i, final int j) {
        if (j != 0) {
            return gcd(j, i % j);
        } else {
            return i;
        }
    }
}

