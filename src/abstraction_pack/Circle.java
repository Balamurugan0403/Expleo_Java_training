package abstraction_pack;

class Circle extends Shape {
	private double radius;
	final static double PI = 3.14;

	Circle(double radius) {
		this.radius = radius;
	}

	void area() {
		System.out.println("Area of Circle: " + (PI * radius * radius));
	}

	void perimeter() {
		System.out.printf("Perimeter of Circle: %.2f",(2 * PI * radius));
	}

}
