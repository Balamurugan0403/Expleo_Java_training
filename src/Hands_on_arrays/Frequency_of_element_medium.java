package Hands_on_arrays;

public class Frequency_of_element_medium{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,10,10,20,20,20,20,40,40,50,50,30};
		int len=arr.length;
		boolean temp[]=new boolean[len];
		for(int j=0;j<len;j++) {
			temp[j]=false;
		}
		for(int i=0;i<len;i++) {
			if(temp[i]!=true) {
			int count=0;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					temp[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" occurs:"+(count+1)+" times");
		}}
	}

}
