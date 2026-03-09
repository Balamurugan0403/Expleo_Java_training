package Hands_on_arrays;
import java.util.Scanner;
public class frequency_of_elemnt_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,4,7,4,7,9,8,2,9,4};
		int len=arr.length;
		int temp[]=new int[len];
		for(int i=0;i<len;i++) {
			int count=0;
			if(temp[i]>=0) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					temp[j]=-1;
					count++;
				}
			}
		System.out.println(arr[i]+"-->"+(count+1)+"times");
		    }
		}
		
	}

}
