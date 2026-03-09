package Control_flow_assign;
import java.util.Scanner;
public class Internet_browsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time(in mins) :");
		int min=sc.nextInt();
		if(min<60) {
			int cost=min*1;
			System.out.println("total cost"+cost);
		}
		else {
			int hour=min/60;
			min=min%60;
			if(hour<5) {
			hour=hour*50;
			System.out.println("total cost:"+(hour+min*1));}
			else if(hour==5) {
				System.out.println("total cost:"+hour+(min*1));
			}else {
				int rem=hour%5;
				rem=rem*50;
				System.out.println("total cost:"+((500+rem)+(min*1)));
			}
		}

	}

}
