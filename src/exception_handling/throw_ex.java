package exception_handling;

import java.util.Scanner;
public class throw_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		array_problem();

	}
	static void array_problem() {
		int a[]=new int[] {34,54,12,21,43};
		try {
			for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"array exceeds error!");
		}
		
	}

}
