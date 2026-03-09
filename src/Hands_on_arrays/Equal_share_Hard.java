package Hands_on_arrays;
import java.util.*;
public class Equal_share_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum % n == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

	}

}
