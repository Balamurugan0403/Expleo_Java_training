package Hands_on_arrays;
import java.util.Scanner;

public class Duplicate_elemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {3,4,7,4,7,9,8,2,9,4};
	int len=arr.length;
	int temp[]=new int[len];
	int j=0;
	System.out.println("The duplicate elements:");
	for(int i=0;i<len;i++) {
		int count=0;
		if(temp[i]>=0) {
		for(j=i+1;j<len;j++) {
			if(arr[i]==arr[j]) {
				temp[j]=-1;
				count++;
			}
		}
		if(count>0) {
		System.out.println(arr[i]);
		}
		}
	}
	}
}