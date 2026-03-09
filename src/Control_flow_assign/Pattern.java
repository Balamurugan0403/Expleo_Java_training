package Control_flow_assign;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=0;i<number;i++) {
        	for(int j=0;j<i+1;j++) {
        		System.out.print(i+1+" ");
        	}
        	System.out.println();
        }
	}

}
