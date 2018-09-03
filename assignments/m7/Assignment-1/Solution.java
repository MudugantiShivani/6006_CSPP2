import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * { var_description }.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      value  The value
     */
    InputValidator(final String value) {
        /**
         * { item_description }.
         */
        this.input  = value;
    }
    /**
     * { returns true if the length is greater than or equal to six }.
     *
     * @return     {boolean value} }
     */
    boolean validateData() {
        /**
         * { var_description }
         */
        String str = this.input;
        int len = str.length();
        final int six = 6;
        if (len >= six) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
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
     * { item_description }.
     * @param      args The value
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}

