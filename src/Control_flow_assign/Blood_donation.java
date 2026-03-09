package Control_flow_assign;

import java.util.*;

public class Blood_donation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		while (score > 0) {
			scorecheck(score);
			score = sc.nextInt();
		}

	}

	public static void scorecheck(int s) {

		if (s % 9 == 0) {
			System.out.println(4);
		}

		else if (s % 10 == 3) {
			System.out.println(3);
		} else if (s % 8 == 0) {
			System.out.println(2);
		} else if (s % 2 != 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
