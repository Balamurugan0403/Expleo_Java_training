package Functions_hands_on;
import java.util.Scanner;
public class Overtimepay_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
		int workhour=sc.nextInt();
		int pay=calculatepay(workhour);
			System.out.println("Employee"+(i+1)+": Rs."+pay);
		}
	}
	public static int calculatepay(int workhour) {
		int extrahour=workhour-40;
		int pay=extrahour*15;
		return pay;
	}

}
