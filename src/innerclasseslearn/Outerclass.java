package innerclasseslearn;

public class Outerclass {
	int age=18;
	public void checkage() {
		System.out.println("in checkage() method call");
	}
	class Innerclass{
		public void show() {
			System.out.println("in ");
		}
	}

}
