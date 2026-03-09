package Control_flow_assign;

import java.util.*;

public class Character_check2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z') {
			if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("It is vowel");
	
		else
		System.out.println("It is a consonant");
		}
		else {
			System.out.println("It is a symbol");
		}
	}

}
