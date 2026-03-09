package Hands_on_arrays;
import java.util.*;
public class Rolling_of_dice_medium{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		for(int k=0;k<100;k++) {
		int m=(int)(Math.random()*6+1);
		arr[k]=m;
		}
		
		boolean temp[]=new boolean[100];
		for(int j=0;j<100;j++) {
			temp[j]=false;
		}
		for(int i=0;i<100;i++) {
			if(temp[i]!=true) {
			int count=0;
			for(int j=i+1;j<100;j++) {
				if(arr[i]==arr[j]) {
					temp[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" occurs:"+(count+1)+" times");
		}}
	}

}
