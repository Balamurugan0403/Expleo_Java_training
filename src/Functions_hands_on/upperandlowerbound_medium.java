package Functions_hands_on;
import java.util.Scanner;
public class upperandlowerbound_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lb=sc.nextInt();
		int ub=sc.nextInt();
		oddevensum(lb,ub);

	}
	public static void oddevensum(int lb,int ub)
	{
		int even=0,odd=0;
		for(int i=lb;i<=ub;i++) {
			if(i%2==0) {
				even=even+i;
				
			}
			else {
				odd=odd+i;
			}
		}
		System.out.println("The sum of odd numbers from "+lb+" to"+ub+ " is: "+odd);
		System.out.println("The sum of even numbers from "+lb+" to"+ub+ " is: "+even);
		System.out.println("The absolute difference between the two sums is:"+Math.abs(odd-even));
	}
}
