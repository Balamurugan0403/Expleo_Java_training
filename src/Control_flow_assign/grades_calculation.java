package Control_flow_assign;
import java.util.*;
public class grades_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sum=0;
		int n=0;
		while(true) {
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		if(x<0 || y<0) {
			break;
		}
		if(x>=5 && y>=5) {
			x=x*0.3f;
			y=y*0.7f;
			sum=sum+(x+y);
			n++;
			
		}
		else {
			float min=Math.min(x, y);
			sum=sum+min;
			n++;
		}
		

	}
		
		System.out.printf("%.1f",sum/n);

}
}
