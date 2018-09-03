import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
	/**
	 * { var_description }
	 */
	String input;
	InputValidator(String value) {
		/**
		 * { item_description }
		 */
		this.input  = value;
	}
	boolean validateData() {
		/**
		 * { var_description }
		 */
		String str = this.input;
		int len = str.length();
		if (len >= 6) {
			return true;
		}
		return false;
	}
}
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { item_description }
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		InputValidator i = new InputValidator(input);
		System.out.println(i.validateData());

	}

}
