import java.util.Scanner;


public class Solution {
	/**
	 * { This is the function where we take the inputs }
	 *
	 * @param      args  is type string
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	*/
	/**
	 * { 	Need to write the rootsOfQuadraticEquation function and print the output. }
	 *
	 * @param      a     { type int }
	 * @param      b     { type int }
	 * @param      c     { type int }
	 */
	public static void  rootsOfQuadraticEquation(int a, int b, int c) {
		double x;
		double y;
		x = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);

		y = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
		System.out.println(x + " " + y);
	}
}
