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
         * {This is a constructor}.
         */
    }
    /**
     * {In this function we find largest number of array}.
     *
     * @param      args string data type
     */
    public static void main(final String[] args) {
        int n, largestnumber;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largestnumber = arr[0];
        for (int i = 0; i < n; i++) {
            if (largestnumber < arr[i]) {
                largestnumber = arr[i];
            }
        }
        System.out.println(largestnumber);

    }
}
