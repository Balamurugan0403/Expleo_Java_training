package Functions_hands_on;
import java.util.*;
public class Primenumbers_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=primenumber();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}
	public static int[] primenumber(){
		int k=0;
		int arr[]=new int[100];
		for(int i=2;i<=100;i++) {
			boolean isprime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				arr[k++]=i;
			}
		}
		return arr;
	}

}
