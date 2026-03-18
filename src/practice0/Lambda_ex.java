package practice0;
interface Add{
	int add(int a,int b);
}
public class Lambda_ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Add a=(x,y) -> x+y;
//		int c=a.add(4, 5);
//		System.out.println(c);
		
		Add a=new Add(){
			public void add(int a,int b) {
				System.out.println("sum:"+(a+b));
			}
		};
		int res=a.add(4,5);
		

	}

}
