package Functions_hands_on;
import java.util.Scanner;
public class Blooddonor_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		calculatedonor(age,weight);

	}
	public static void calculatedonor(int age,int weight) {
		if(age>18 && age<55) {
			if(weight>45) {
				System.out.println("Your eligible to donate blood");
			}
			else {
				System.out.println("Your not eligible to donate blood");
			}
		}
		else {
			System.out.println("Your not eligible to donate blood");
		}
	}

}
