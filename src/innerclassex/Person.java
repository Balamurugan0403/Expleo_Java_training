package innerclassex;

class Person {
	int age=21;
	static int weight=57;
	static class Gender{
		void nonstaticdisplay() {
			System.out.println("in non static display method");
			System.out.println("weight value:"+weight);
		}
		static void staticdisplay() {
			System.out.println("in static display method");
			System.out.println("weight value:"+weight);
		}
	}
    Gender gender=new Gender();
    
}
