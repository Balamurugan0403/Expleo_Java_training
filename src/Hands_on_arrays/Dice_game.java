package Hands_on_arrays;
import java.util.*;
public class Dice_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int arr1[]=new int[10];
			int arr2[]=new int[10];
			for(int i=0;i<10;i++) {
				int choice1=sc.nextInt();
				int choice2=sc.nextInt();
				arr1[i]=choice1;
				arr2[i]=choice2;
			}
			int sum1=0,sum2=0;
			for(int m=0;m<10;m++) {
				sum1=sum1+arr1[m];
				sum2=sum2+arr2[m];
				
			}
			if(sum1>sum2) {
				System.out.println("Ajay wins");
			}
			else {
				System.out.println("Praveen wins");
			}
	}

}
