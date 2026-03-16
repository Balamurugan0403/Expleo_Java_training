package arraylist;
import java.util.*;
public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("size at initial:"+list.size());
		list.add("c");
		list.add("c++");
		list.add("python");
		list.add("java");
		list.add("javascript");
		System.out.println("size at after:"+list.size());
		System.out.println("contents:"+list);
		list.remove(3);
		list.remove("c++");
		System.out.println("new linked list:"+list);
	   
	}

}

