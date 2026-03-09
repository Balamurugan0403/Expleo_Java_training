package Java_core;
class Demo{
	public void print() {
		System.out.println("just printed");
	}
	 protected void finalize() {
	        System.out.println("Object Destroyed by Garbage Collector");
	    }
}
public class Typecoversion{
	public static void main(String[]args) {
		int i=12;
		long l=i;
		float f=i;
		Demo d=new Demo();
		d.print();
		System.out.println(l);
		System.out.println(f);
		d=null;
		System.gc();
		
		d.print();
//		after destroying the object ,if we refer method we will get the error 
//		like object destroyed by garbage collector //
//		
	}
}