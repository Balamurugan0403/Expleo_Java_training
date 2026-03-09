package abstraction_handson_qn2;

abstract class Payment {

    String transactionId;
    double amount;
    String customerName;

    Payment(String transactionId, double amount, String customerName) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerName = customerName;
    }

    abstract boolean validatePayment();
    abstract boolean processPayment();

    void executeTransaction() {
        if(validatePayment()) {
            if(processPayment()) {
                System.out.println("Payment Successful");
            } else {
                System.out.println("Payment Failed");
            }
        } else {
            System.out.println("Validation Failed");
        }
    }
}