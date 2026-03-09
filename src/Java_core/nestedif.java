package Java_core;
import java.util.*;
public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>18) {
			if(weight>45) {
				System.out.println("you're eligible to doante blood");
			}
			else {
				
				System.out.println("you're underweight");
			}
		}
		else {
			System.out.println("you are not eligible to doante blood");
		}

	}

}
