package access_modifi_1;

public class Access1 {
	protected int age=10;
	protected int weight=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a=new Access1();
		System.out.println("Base class protected varibles access.");
		System.out.println("age:"+a.age+" weight:"+a.weight);

	}

}
