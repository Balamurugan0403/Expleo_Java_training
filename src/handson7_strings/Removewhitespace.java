package handson7_strings;
import java.util.Scanner;
public class Removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=removespaces(s);
		System.out.println("After removing whitepsace: "+str);
	}
	public  static String removespaces(String s) {
		int start=0;
		int end=s.length()-1;
		while(start<=end && Character.isWhitespace(s.charAt(start))) {
			start++;
		}
		while(end>=start && Character.isWhitespace(s.charAt(end))) {
			end--;
			
		}
		return s.substring(start,end+1);
	}

}
