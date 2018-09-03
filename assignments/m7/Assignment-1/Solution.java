import java.util.*;
class InputValidator {
	String input;
	InputValidator(String value) {
		this.input  = value;
	}
	boolean validateData() {
		String str = this.input;
		int len = str.length();
		if (len >= 6) {
			return true;
		}
		return false;
	}
}
public class Solution {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		InputValidator i = new InputValidator(input);
		System.out.println(i.validateData());

	}

}
