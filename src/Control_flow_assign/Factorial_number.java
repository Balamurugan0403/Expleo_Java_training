package Control_flow_assign;
import java.util.Scanner;
public class Factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Invalid Input");
		}
		else {
		int i=1,sum=1;
		while(sum<n) {
			sum=sum*i;
			i++;
		}
		if(sum==n) {
			System.out.println("factorial number:"+(i-1));
		}
		else {
			System.out.println("Sorry.The given number is not a perfect factorial");
		}
		}
	}

}
