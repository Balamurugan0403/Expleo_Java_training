package Control_flow_assign;
import java.util.*;
public class Gross_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basicsalary=sc.nextInt();
		int grosssalary,HRA,DA;
		if(basicsalary<=10000) {
			HRA=(int) (basicsalary*0.2);
			DA=(int) (basicsalary*0.8);
			grosssalary=basicsalary+HRA+DA;
			System.out.println("Gross salary:"+grosssalary);
		}
		else if(basicsalary>10000 && basicsalary<=20000 ) {
			HRA=(int) (basicsalary*0.25);
			DA=(int) (basicsalary*0.9);
			grosssalary=basicsalary+HRA+DA;
			System.out.println("Gross salary:"+grosssalary);
		}
		else if(basicsalary>20000) {
			HRA=(int) (basicsalary*0.3);
			DA=(int) (basicsalary*0.95);
			grosssalary=basicsalary+HRA+DA;
			System.out.println("Gross salary:"+grosssalary);
		}
	}

}
