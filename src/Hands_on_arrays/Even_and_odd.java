package Hands_on_arrays;
import java.util.*;
public class Even_and_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int a[]=new int[10];
		int b[]=new int[10];
		int m=0,n=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				a[m]=arr[i];
				m++;
			}
			else {
				b[n]=arr[i];
				n++;
			}
		}
		for(int y=0;y<m;y++) {
			System.out.print(a[y]+" ");
		}
		for(int z=0;z<n;z++) {
			System.out.print(b[z]+" ");
		}

	}

}
