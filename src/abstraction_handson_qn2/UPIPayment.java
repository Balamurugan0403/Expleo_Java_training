package abstraction_handson_qn2;

class UPIPayment extends Payment {
	String upiId;
	String upiPin;

	UPIPayment(String transactionId, double amount, 
			String customerName, String upiId, String upiPin){
				super(transactionId,amount,customerName);
				this.upiId=upiId;
				this.upiPin=upiPin;
	}
	boolean validatePayment() {
		return upiId.contains("@") && upiPin.length() == 4;
	}
	boolean processPayment() {
		return true;
	}
}
