import java.util.Scanner;
public class Solution {
	static long binaryToDecimal(final String s) {
		long binarynum = (long) Long.parseLong(s);
		int b = 0;
		final int ten = 10;
		long result = 0;
		long num = binarynum;
		while (num > 0) {
			long x = num % ten;
			result += x * Math.pow(2, b);
			num = num / ten;
			b = b + 1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();sc.nextLine();
		for (int i = 0; i <= n; i++) {
			String s = sc.nextLine();
			long res = binaryToDecimal(s);
			System.out.println(res);
		}
	}
}
