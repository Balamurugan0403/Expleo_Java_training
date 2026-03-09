package Control_flow_assign;
import java.util.*;

public class Charavter_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z') {
			System.out.println("It is an alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It is digit");
		}
		else {
			System.out.println("It is a special character");
		}
	}

}
