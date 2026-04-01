package practice1;

public class Exceptionex {
	public static int divide(int a,int b)throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("cannot divide by the zero");
		}
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5,b=0;
			int c=divide(a,b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally blocks run");
		}

	}

}
