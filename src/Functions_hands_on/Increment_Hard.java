package Functions_hands_on;
import java.util.Scanner;
public class Increment_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		int salary=sc.nextInt();
		System.out.println("Enter the appraisal rating:");
		int rate=sc.nextInt();
		if(salary>0 && (rate>=1 && rate<=10)) {
		int incrementsalary=calculateincrement(salary,rate);
		System.out.println("Incremented total salary :"+incrementsalary);
		}
	}
	public static int calculateincrement(int salary,int rate) {
		
		int total=0;
		if(rate>=1 && rate<=4) {
			total=salary+(int)(salary*0.10);
		}
		else if(rate>=4.1 && rate<=7) {
			total=salary+(int)(salary*0.25);
		}
		else if(rate>=7.1 && rate<=10) {
			total=salary+(int)(salary*0.30);
		}
		
		return total;
		
	}

}
