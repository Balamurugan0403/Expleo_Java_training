package Demo_generic;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo <Integer> jobj=new Demo<Integer>();
		jobj.set(25);
		System.out.println(jobj.get());
		Demo <String> sobj=new Demo<String>();
		sobj.set("huri");
		System.out.println(sobj.get());

	}

}
class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get(){
		return t;
	}
}
