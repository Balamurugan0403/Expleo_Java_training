package abstraction_pack;

class Rectangle extends Shape {
     private int length,breadth;
     Rectangle(int length,int breadth){
    	 this.length=length;
    	 this.breadth=breadth;
     }
     void perimeter() {
    	 System.out.println("perimeter is:"+2*(length+breadth));
    	 
     }
     void area() {
    	 System.out.println("area is:"+(length*breadth));
     }
}
