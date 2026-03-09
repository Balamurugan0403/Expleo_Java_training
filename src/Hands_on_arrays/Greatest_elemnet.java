package Hands_on_arrays;
import java.util.Scanner;
public class Greatest_elemnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{2,4,5},{14,13,10},{22,45,15},{32,14,24}};
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Greatest elemnt in array:"+max);

	}

}
