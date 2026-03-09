package assessment_2;
class ClothingProduct extends Product {
	String size;
	String material;
	ClothingProduct(int productId,String productName,double price,String size,String material){
		super(productId,productName,price);
		this.size=size;
		this.material=material;
	}
	public String getSize() {
		return size;
	}
	public String getMaterial() {
		return material;
	}
	public void displayInfo() {
		System.out.println("\tCLOTHING PRODUCT INFORMATION:");
		System.out.println("ProductId:"+productId);
	    System.out.println("ProductName:"+productName);
	    System.out.println("Price:"+price);
	    System.out.println("Size:"+size);
	    System.out.println("Material:"+material+"\n\n");
	}
}
