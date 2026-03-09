package abstraction_handson_qn2;
import java.util.Scanner;
public class Onlinedigitalpayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment payment = null;

		System.out.println("Choose Payment Method");
		System.out.println("1. Credit Card");
		System.out.println("2. Net Banking");
		System.out.println("3. UPI");

		System.out.println("Enter the choose: ");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.print("Transaction ID: ");
		String transactionId = sc.nextLine();

		System.out.print("Customer Name: ");
		String customerName = sc.nextLine();

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();

		switch (choice) {

		case 1:
			System.out.print("Card Number: ");
			String card = sc.nextLine();

			System.out.print("CVV: ");
			String cvv = sc.nextLine();

			System.out.print("Expiry Date (MM/YY): ");
			String exp = sc.nextLine();

			payment = new CreditCardPayment(transactionId, amount, customerName, card, cvv, exp);
			break;

		case 2:
			System.out.print("Account Number: ");
			String acc = sc.nextLine();

			System.out.print("IFSC: ");
			String ifsc = sc.nextLine();

			payment = new NetBankingPayment(transactionId, amount, customerName, "PENDING", acc, ifsc);
			break;

		case 3:
			System.out.print("UPI ID: ");
			String upi = sc.nextLine();

			System.out.print("UPI PIN: ");
			String pin = sc.nextLine();

			payment = new UPIPayment(transactionId, amount, customerName, "PENDING", upi);
			break;
		}

		payment.executeTransaction();
	}

}
