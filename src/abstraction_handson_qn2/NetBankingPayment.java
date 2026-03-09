package abstraction_handson_qn2;

class NetBankingPayment extends Payment {
	String bankName;
	String accountNumber;
	String ifscCode;

	NetBankingPayment(String transactionId, double amount, String customerName, String bankName, String accountNumber,
			String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;

	}
	boolean validatePayment() {
		
		 return accountNumber.length() >= 10 && ifscCode.length() == 11;
		        
		    
	}
	boolean processPayment() {
		return true;
	}
}
