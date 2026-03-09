package Interface_learn;
class Rectangle implements Shape {
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}public Rectangle() {
		this.length=Default_value;
		this.width=Default_value;
	}
	public double calculateArea() {
		return length*width;
	}
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	public String getDescription() {
		return "A rectangle with length"+length+"and width"+width;
	}
	
}
