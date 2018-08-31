
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverseerse=reverseerseString(s);	
		System.out.println(reverseerse);
		
	}

    static String reverseerseString(final String reverse) {
        String result = "";
        char[] array1 = reverse.toCharArray();
        int len = reverse.length();
        for (int k = len - 1; k >= 0; k--) {
            result += array1[k];
        }

        return result;

    }
	

}
