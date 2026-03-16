package arraylist;
import java.util.*;
public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<String>();
		System.out.println("size of the vector:"+v.size()+" "+v.capacity());
		v.add("b");
		v.add("z");
		v.add("c");
		v.add("e");
		System.out.println("elemtns in vector:"+v);
		System.out.println("size of vector:"+v.size());
		Vector<String>v1=new Vector<String>(4);
		System.out.println("size of the vector:"+v1.size()+" "+v1.capacity());
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("e");
		System.out.println("elemtns in vector:"+v1);
		System.out.println("size of the vector:"+v1.size()+" "+v1.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
