package Control_flow_assign;
import java.util.*;
public class Employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name=sc.nextLine();
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		System.out.println("Enter no of days worked(per month):");
		int days=sc.nextInt();
		System.out.println();
		int salary;
		if(days<10) {
			salary=days*2000;
			System.out.println("Name:"+name+"\nDays worked:"+days+"\nYour total salary:"+salary);
		}
		else if(days>10 && days<20) {
			salary=days*2000;
			System.out.println("Name:"+name+"\nDays worked:"+days+"\nYour total salary:"+salary);
		}
		else {
		salary=days*2000;
		System.out.println("Name:"+name+"\nDays worked:"+days+"\nYour total salary:"+salary);
		
		}

	}

}
