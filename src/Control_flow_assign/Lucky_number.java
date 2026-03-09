package Control_flow_assign;
import java.util.*;
public class Lucky_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<1000||number>9999) {
			System.out.println(number+"is not a valid car number");
		}
		else {
			int sum=0;
			int temp=number;
			while(temp>0) {
				temp=temp%10;
				sum=sum+temp;
				temp=temp/10;
			}
			if(sum%3==0 ||sum%5==0||sum%7==0) {
				System.out.println("Lucky number");
			}
			else {
				System.out.println("Sorry its not my lucky number");
			}
		}
	}

}
