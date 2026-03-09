package Hands_on_arrays;
import java.util.*;
public class Sorting_elemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) {
        	 int data=sc.nextInt();
        	 arr[i]=data;
         }
         int temp;
        for(int i=0;i<n-1;i++) {
        	 for(int j=i+1;j<n;j++) {
        		 if(arr[i]>arr[j]) {
        			 temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
         }    
        for(int k:arr) {
        	System.out.println(k);
        }
         
	}

}
