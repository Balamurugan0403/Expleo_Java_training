package Control_flow_assign;
import java.util.Scanner;
public class Cloth_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double total_cost=sc.nextDouble();
		double discount=0;
		if(total_cost<2000) {
			discount=0.05;
		}
		else if(total_cost>=2000 && total_cost<5000) {
			discount=0.25;
		}
		else if(total_cost>=5000 && total_cost<10000) {
			discount=0.35;
		}
		else {
			discount=0.50;
		}
		double amount_to_pay=total_cost-(total_cost*discount);
		System.out.println(amount_to_pay);
		
	}

}
