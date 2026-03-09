package assessment_2;
import java.util.Scanner;
public abstract class Product {
	int productId;
	String productName;
	double price;
	Product(int productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int productId;
		String productName;
		double price;
		int warrantyperiod;
		String size;
		String material;
		int opt=0;
		do {
		System.out.println("\tPRODUCT INFORMATION\n-----------------------------------\n");
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("3.EXIT\n");
		System.out.println("Enter the option to view Information:");
		opt=sc.nextInt();
		switch(opt) {
			case 1:
				System.out.println("\nEnter the ProductId");
				productId=sc.nextInt();
				System.out.println("\nEnter the ProductName");
				productName=sc.next();
				System.out.println("\nEnter the Price:");
				price=sc.nextDouble();
				System.out.println("\nEnter the Warranty Period(in months):");
				warrantyperiod=sc.nextInt();
				Product ep=new ElectronicProduct(productId,productName,price,warrantyperiod);
				ep.displayInfo();
				break;
			case 2:
				System.out.println("Enter the ProductId:");
				productId=sc.nextInt();
				System.out.println("\nEnter the ProductName:");
				productName=sc.next();
				System.out.println("\nEnter the Price:");
				price=sc.nextDouble();
				System.out.println("\nEnter the Size:");
				size=sc.next();
				System.out.println("\nEnter the Material:");
				material=sc.next();
				Product cp=new ClothingProduct(productId,productName,price,size,material);
				cp.displayInfo();
			    break;
			case 3:
				break;
			default:
				System.out.println("Invalid option");
				break;
				
		}
		
		}while(opt<=2);
	}
	public int getProductId() {
		return productId;
		
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	abstract void displayInfo();
}

