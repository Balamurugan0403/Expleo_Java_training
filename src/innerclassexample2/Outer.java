package innerclassexample2;

public class Outer {
	int value=56;
	public void outerClassmethod() {
		System.out.println("inside the method of outer class");
		class Inner{
			public void innerClassmethod() {
				System.out.println("inside the method of inner class");
				System.out.println("value:"+value);
				
			}
		}
		Inner inner=new Inner();
		inner.innerClassmethod();
		
	}
}
