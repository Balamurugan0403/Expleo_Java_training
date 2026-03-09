package innerclasseslearn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass outer=new Outerclass();
		System.out.println("outerclass.age"+outer.age);
		System.out.println("outerclass.checkage():");
		outer.checkage();
		Outerclass.Innerclass inner=outer.new Innerclass();
		System.out.println("inner class method call:"
				+ "");
		inner.show();
	}

}
