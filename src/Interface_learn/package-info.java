package Interface_learn;
class Circle implements Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle() {
		this.radius=Default_value;
	}
	public double calculateArea() {
	        return Math.PI * radius * radius;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
		
	}
	public String getDescription() {
		return "A circle with radius"+radius;
	}
}