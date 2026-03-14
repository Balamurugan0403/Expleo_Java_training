package Demo_generic;


import java.util.ArrayList;
import java.util.List;

public class Generic_Bound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> ints=new ArrayList<>();
		ints.add(3.5f);
		ints.add(5.5f);
		ints.add(7.2f);
		float sum=sum(ints);
		System.out.println("sum of integer:"+sum);
		
		
	}
	public static float sum(List<? extends Number>list) {
		float sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}

}
