package Control_flow_assign;
import java.util.Scanner;
public class Counting_hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		do {
			int n=sc.nextInt();
			if(n<0) {
				break;
			}
			for(int i=0;i<n;i++) {
				System.out.println("Hello");
				count++;
			}
		}
		while(true);
		
		System.out.println("No of hello:"+count);
	}

}
