package abstraction_pack;

abstract class Shape {
	void draw() {
		System.out.println("drawing...");
	}

	abstract void area();

	abstract void perimeter();

}
