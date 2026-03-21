package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class maximum_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list= new ArrayList<String>();
		System.out.println("How many names do you want to input?");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter name "+i+": ");
			String name=sc.next();
			list.add(name);
		}
		System.out.println("Names longer than 5 characters:");
		for(String name:list) {
			if(name.length()>5) {
				System.out.println(name);
			}
		}
		
	}

}
