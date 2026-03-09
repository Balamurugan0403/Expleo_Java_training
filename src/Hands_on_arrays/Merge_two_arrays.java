package Hands_on_arrays;
import java.util.*;
public class Merge_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr1[]= {12,34,67,76,13};
		int arr2[]= {43,71,32,12,43,12};
		int len=arr1.length+arr2.length;
		int arr3[]=new int[len];
		int m=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[m++]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[m++]=arr2[i];
			
		}		
		for(int a:arr3) {
			System.out.print(a+" ");
		}
	}

}
