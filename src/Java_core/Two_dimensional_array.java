package Java_core;
import java.util.Scanner;
/* Two dimensional array */
public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{1,2},{3,4},{5,6},{7,8}};
		for(int i=0;i<arr[i].length;i++) {
			for(int j=0;j<arr[j].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
