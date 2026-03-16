package arraylist;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Stack <String> stk=new Stack<String>();
		System.out.println("initial size"+stk.size());
		stk.push("A");
		stk.push("c");
		stk.push("b");
		stk.push("d");
		stk.push("e");
		stk.push("f");
		System.out.println("elements in the stack"+stk);
		System.out.println("size of the stack:"+stk.size());
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		stk.push("z");
		stk.remove(2);
		System.out.println("size of stack:"+stk.size());
		System.out.println(stk.peek());

	}

}
