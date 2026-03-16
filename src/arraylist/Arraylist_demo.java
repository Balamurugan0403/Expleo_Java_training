package arraylist;
import java.util.*;
public class Arraylist_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arr=new ArrayList<String>();
		System.out.println("initial size:"+arr.size());
		arr.add("C");
		arr.add("f");
		arr.add("g");
		arr.add("u");
		arr.add(1,"R");
		System.out.println("After insert array size:"+arr.size());
		arr.remove("g");
		arr.remove(0);
		
		System.out.println("after deletion array size:"+arr.size());
		System.out.println("contents of the array:"+arr);
		
		ArrayList <Integer> arr1=new ArrayList<Integer>();
		System.out.println("initial size:"+arr1.size());
		arr1.add(4);
		arr1.add(12);
		arr1.add(45);
		arr1.add(24);
		arr1.add(74);
		System.out.println("contents:"+arr1);
		Object[] array=arr1.toArray();
		for(Object A:array) {
			System.out.println(A);
		}
		Integer ia[]=new Integer[arr1.size()];
		ia=arr1.toArray(ia);
		int sum=0;
		for(int i:ia) {
			sum+=i;
		}
		System.out.println("sum value is:"+sum);
		
		
	}

}
