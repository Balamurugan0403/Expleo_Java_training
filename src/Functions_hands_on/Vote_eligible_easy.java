package Functions_hands_on;
import java.util.*;
public class Vote_eligible_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		votecheck(age);

	}
	public static void votecheck(int age) {
		if(age>18) {
			System.out.println("Eligible for vote");
	
		}
		else {
			System.out.println("You are not eligible for vote");
		}
	}

}
