package Control_flow_assign;
import java.util.*;
public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int sum;
		sum=sum_of_digits(number);
		System.out.println("Sum of digits:"+sum);
}
	public static int sum_of_digits(int number) {
		int rem,sum = 0,q;
		
		if(number<0) {
			number=-(number);
			sum_of_digits(number);
		}
		while(number>0) {
		rem=number%10;
		sum=sum+rem;
		number=number/10;
		}
		return sum;
		
	}

}
