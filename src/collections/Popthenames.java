package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Popthenames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> marks= new HashMap<>();
		marks.put("Mano",85);
		marks.put("Shan",85);
		marks.put("John",55);
		marks.put("Anu",60);
		marks.put("Aju",90);
		marks.put("Frank",80);
		abovemarks(marks);
		

	}
	public static void abovemarks(Map<String, Integer> marks) {
		System.out.print("Student Marks in the HashMap:");
		System.out.println(marks);
		System.out.println("Student Marks above 75 in the stack:");
		Stack <String> stk=new Stack<>();
		for(String name:marks.keySet()) {
			if(marks.get(name)>75){
				stk.push(name);
			}
		}
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
	}

}
