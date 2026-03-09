package abstraction_pack;

class Sqaure extends Shape{
	 private int side;
	
	Sqaure(int side){
		 this.side=side;
	 }
	 void perimeter() {
		 System.out.println("the perimeter"+4*side);
	 }
	 void area() {
		 System.out.println("the area "+side*side);
	 }
	
}
