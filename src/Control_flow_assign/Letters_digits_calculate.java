package Control_flow_assign;

import java.util.Scanner;

public class Letters_digits_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		int l=str.length();
		int letter=0,digits=0,other=0;
		for(int i=0;i<l;i++) {
			char ch=str.charAt(i);
		if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z') {
			letter=letter+1;
		}
		else if(ch>='0' && ch<='9') {
			digits=digits+1;
		}
		else {
			other=other+1;
		}
	}
		System.out.println("Letters: "+letter+"  "+"Digits: "+digits+" "+"Other Symbols: "+other);
		}

	}
