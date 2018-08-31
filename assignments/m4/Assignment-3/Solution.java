import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <= n; i++) {
			String s = sc.nextLine();
			long res = binaryToDecimal(s);
			System.out.println(res);
		}
	}
	static long binaryToDecimal(final String s) {
		long i = (long) Long.parseLong(s);
		int b = 0;
		final int ten = 10;
		long sum = 0;
		long y = i;
		while (y > 0) {
			long x = y % ten;
			sum += x * Math.pow(2, b);
			y = y / ten;
			b = b + 1;
		}
		return sum;

	}

}
