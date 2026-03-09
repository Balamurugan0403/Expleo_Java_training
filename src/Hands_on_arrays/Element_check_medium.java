package Hands_on_arrays;
import java.util.*;
public class Element_check_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("key:");
		int key=sc.nextInt();
		boolean k=false;
		for(int i=0;i<n;i++) {
			if(key==arr[i]) {
				k=true;
				break;
			}
		}
		if(k) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
