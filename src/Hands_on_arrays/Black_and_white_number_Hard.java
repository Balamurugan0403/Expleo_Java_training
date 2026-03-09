package Hands_on_arrays;
import java.util.Scanner;
public class Black_and_white_number_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int k=0;
		for(int i=0;i<100;i++) {
			int num=sc.nextInt();
			if(num<0) {
				break;
			}
			arr[i]=num;
			k++;
			
		}
		
		processarray(arr,k);

	}
	public static void processarray(int arr[],int k) {
		for(int j=0;j<k;j++) {
			if(arr[j]%7==0 && arr[j]%8==0) {
				arr[j]=-6;
			}
			else if(arr[j]%8==0) {
				arr[j]=-9;
			}
			else if(arr[j]%7==0) {
				arr[j]=-2;
			}
		}
		for(int t=0;t<k;t++) {
			System.out.println(arr[t]);
		}
	}

}
