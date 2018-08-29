
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd=gcd(n1,n2);
        System.out.println(gcd);
    }
    public static int gcd(int i, int j){
        if (j!=0){
            return gcd(j, i%j);
        }
        else
            return i;
    }
}
