package assessment_2;

class ElectronicProduct extends Product{
	int warrantyPeriod;
	ElectronicProduct(int productId,String productName,double price,int warrantyperiod){
		super(productId,productName,price);
		warrantyPeriod=warrantyperiod;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void displayInfo() {
	    System.out.println("\tELECTRONIC PRODUCT INFORMATION:");
	    System.out.println("ProductId:"+productId);
	    System.out.println("ProductName:"+productName);
	    System.out.println("Price: $"+price);
	    System.out.println("Warranty Period:"+warrantyPeriod+" Months\n");
	}
	
}
