package Functions_hands_on;
import java.util.Scanner;
public class Primenumbers_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		countprime(x,y);
		

	}
	public static void countprime(int x,int y) {
		int k=0;
		int arr[]=new int[100];
		for(int i=x;i<=y;i++) {
			
			boolean prime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				arr[k++]=i;
			}}
			for(int m:arr) {
				if(m!=0)
					System.out.print(m+" ");
			}
		
	}

}
