import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n, largestnumber;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largestnumber = arr[0];
        for (int i = 0; i < n; i++) {
            if (largestnumber < arr[i]) {
                largestnumber = arr[i];
            }
        }
        System.out.println(largestnumber);

    }
}
