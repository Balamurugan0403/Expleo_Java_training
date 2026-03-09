package Control_flow_assign;
import java.util.*;
public class SortingusingASCII_hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[]arr=str.toCharArray();
		char temp;
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
				
			}
		}
		for(char ch:arr) {
			System.out.print(ch);
		}
	}

}
