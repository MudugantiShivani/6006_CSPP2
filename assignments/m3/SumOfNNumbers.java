import java.util.Scanner;
public class SumOfNNumbers {

    public static void main(String[] args) {
		int  sum = 0;
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i <= n; ++i)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}