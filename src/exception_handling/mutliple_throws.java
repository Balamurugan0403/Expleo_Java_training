package exception_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class mutliple_throws {

	public static void main(String[] args) {

		try {
			test();
		}

		catch (IOException e) {
			System.out.println("File error occurred");
		}

		catch (ArithmeticException e) {
			System.out.println("Divide by zero");

		}
	}

	static void test() throws IOException, ArithmeticException {

		FileInputStream file = new FileInputStream("data.txt"); 

		int a = 10;
		int b = 0;
		int c = a / b; 
	}

}
