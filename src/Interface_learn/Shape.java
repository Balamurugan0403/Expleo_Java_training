package Interface_learn;

public interface Shape {
	double Default_value=1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified dimension";
	}
}
