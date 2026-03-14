package exception_handling;

public class throws_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[5]); 
		}

		catch (Exception e) {
			System.out.println("Invalid index "+e);
		}

		finally {
			System.out.println("Finally block always runs");
		}
	}

}
