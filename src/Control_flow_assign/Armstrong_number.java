package Control_flow_assign;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num < 100 || num > 999) {
            System.out.println(num + " is not a 3-digit number");
        } 
        else {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum =sum+ (digit * digit * digit);
                temp= temp/10;
            }
            if (sum == num) {
                System.out.println("Armstrong Number");
            } 
            else {
                System.out.println("Not an Armstrong Number");
            }
	}

}
}