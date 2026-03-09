package Control_flow_assign;
import java.util.Scanner;
public class Discount_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		int tot_expenses=0;
		if(price>500) {
			int discount=(int) (price*0.15);
			tot_expenses=price-discount;
			System.out.println("Total expenses:"+tot_expenses);
		}
		else {
			tot_expenses=price;
			System.out.println("Total expenses:"+tot_expenses);
		}
	}

}
