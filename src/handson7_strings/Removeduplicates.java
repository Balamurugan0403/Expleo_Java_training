package handson7_strings;

import java.util.Scanner;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder s3 = remove(input);
		System.out.println(s3);
	}

	public static StringBuilder remove(String s1) {
		StringBuilder s3 = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(s3.indexOf(String.valueOf(ch))==-1) {
				s3.append(ch);
			}
			

		}
		return s3;

	}

}
