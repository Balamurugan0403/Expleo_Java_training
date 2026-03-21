package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Concatenate_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<String> s = new HashSet<>(Arrays.asList(
	            "Java", "Hello", "Programming", "World"
	        ));
		  Iterator<String> it = s.iterator();
	        while (it.hasNext()) {
	            String element = it.next();
	            System.out.println("Elements in the Set : " + element);

	        }
		System.out.print("Concatenated result:");
		for(String word:s){
			System.out.print(word+" ");
		}
		
		}
		

}
