package Hands_on_arrays;
import java.util.*;
public class Merge_and_sort_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		int n3=sc.nextInt();
		int arr3[]=new int[n3];
		for(int i=0;i<n3;i++) {
			arr3[i]=sc.nextInt();
		}
		int k=n1+n2+n3;
		int array[]=new int[k];
		int m=0;
		for(int i=0;i<n1;i++) {
			array[m++]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			array[m++]=arr2[i];
		}
		for(int i=0;i<n3;i++) {
			array[m++]=arr3[i];
		}
		int temp=0;
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
		 if(array[i]>array[j]) {
			 temp=array[i];
			 array[i]=array[j];
			 array[j]=temp;
		 }
	 }
 } 
		for(int p:array) {
			System.out.println(p);
		}
		

	}

}
