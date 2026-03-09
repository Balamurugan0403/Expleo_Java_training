package Control_flow_assign;

import java.util.Scanner;
public class Discount_calculate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price and quantity respectively");
		int price=sc.nextInt();
		int quantity=sc.nextInt();
		int purchase_amount=0;
		int paid_amount=0;
		purchase_amount=price*quantity;
		if(purchase_amount>1000) {
			int discount=(int) (purchase_amount*0.10);
			paid_amount=purchase_amount-discount;
			System.out.println("Total expenses:"+paid_amount);
		}
		else{
			int discount=(int) (purchase_amount*0.05);
			paid_amount=purchase_amount-discount;
			System.out.println("Total expenses:"+paid_amount);
			
		}
	}

}
