package Demo_generic;

public class Test <T,U,R>{
	T obj1;
	U obj2;
	R obj3;
	
	Test(T obj1,U obj2,R obj3){
		this.obj1=obj1;
		this.obj2=obj2;
		this.obj3=obj3;
	}
	public void print() {
		System.out.println(obj1+" "+obj2+" "+obj3);
	}

}
class Demo4{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test <Integer,String,Float> jobj=new Test<>(45,"Ram",54.32f);
		jobj.print();
}}





