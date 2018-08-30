import java.util.Scanner;
public class FirstLast6 {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	int n = ss.nextInt();
	int[] arr=new int[n];
	for (int i = 0; i < arr.length; i++) {
        arr[i]=ss.nextInt();
    }
    firstLast6(arr);
    System.out.print(firstLast6(arr));
}
public static boolean firstLast6( int[] nums ) {
 	if ( nums[0]==6 || nums[nums.length-1]==6 ){
                   return true;
    }
    else{
    	return false;

    }
}
}
