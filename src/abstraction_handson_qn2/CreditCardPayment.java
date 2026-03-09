package abstraction_handson_qn2;

class CreditCardPayment extends Payment{
	String cardNumber;
	String cvv;
	String expiryDate;

	CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;

	}
	boolean validatePayment() {
		return cardNumber.length()==16 && cvv.length()==3 && expiryDate.matches("0[1-9] |1[0-2] / \\d{2}");		
	} 
	public boolean processPayment() {
        return true;
    }
		
}
