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
         * {This is the private calss}
         */
    }
    /**
     * { addition of matrices function }.
     *
     * @param      args data type is string
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int row1 = s.nextInt();
        int column1 = s.nextInt();
        int[][] array1 = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                array1[i][j] = s.nextInt();
            }
        }
        int row2 = s.nextInt();
        int column2 = s.nextInt();
        int[][] array2 = new int[row2][column2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                array2[i][j] = s.nextInt();
            }
        }
        if (row1 == row2 && column1 == column2) {
            int[][] sum = new int[row1][column1];
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    sum[i][j] = array1[i][j] + array2[i][j];

                }
            }

            for (int i = 0; i < row2; i++) {
                String string1 = "";
                for (int j = 0; j < column2; j++) {
                    string1 += sum[i][j] + " ";
                }
                System.out.println(string1.substring(0, string1.length() - 1));
            }

        } else {
            System.out.println("not possible");
        }




    }
}
