package Functions_hands_on;
import java.util.Scanner;
public class Salary_hike_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		int hikeper=sc.nextInt();
		calculatehike(salary,hikeper);
		
	}
	public static void calculatehike(double salary,int hike) {
		double salary_hike=salary+(salary*hike/100);
		System.out.println(salary_hike);
	}

}
