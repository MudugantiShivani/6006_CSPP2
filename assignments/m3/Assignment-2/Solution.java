
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * {function to print number of 7's from 1 to given number}.
     *
     * @param      args  string data type
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int seven = seven(n);
        System.out.println(seven);
    }
    /**
     * {Here the function counts number of 7's}.
     *
     * @param      n     { int data type and reads the number}
     * @return     { returns the count of number of 7's }
     */
    public static int seven(final int n) {
        int i = 0, j = 1;
        int count = 0;
        for (i = 1; i <= n; i++) {
            j = i;
            while (j != 0) {
                if (j % 10 == 7)
                    count++;
                j /= 10;
            }
        }
        return count;
    }
}