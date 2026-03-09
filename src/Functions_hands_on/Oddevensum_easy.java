package Functions_hands_on;

import java.util.Scanner;

public class Oddevensum_easy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Oddeven(n);

	}
	public static void Oddeven(int n) {
		int even=0,odd=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				even=even+i;
			}
			else {
				odd=odd+i;
			}
		}
		System.out.println("Odd sum: "+odd+"\nEven sum: "+even);
	}

}
