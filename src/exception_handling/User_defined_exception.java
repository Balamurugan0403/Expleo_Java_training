package exception_handling;

public class User_defined_exception {

	static void checkAge(int age) {
		try {

			if (age < 18) {
				throw new InvalidAgeException();//here we must throw the exception manually because JVM cannot find the userdefined exception
				//User-defined exceptions, the JVM does not know when the error condition should occur, so the programmer must explicitly throw it.
			}

			System.out.println("eligible to vote");

		}

		catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		checkAge(15);

	}
}
/* When throw new InvalidAgeException() is executed, the constructor of InvalidAgeException runs to create the exception object, 
and then the control transfers to the corresponding catch block. */
class InvalidAgeException extends Exception {

	InvalidAgeException() {
		super("invalid age da bhai !!!"); //passing message to the super class (Exception class)
	}
}
