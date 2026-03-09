package Java_core;
import java.util.Scanner;

public class One_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int arr[]= {1,2,3,4,5};
       
       for(int i=0;i<5;i++) {
    	   System.out.println(arr[i]+" ");
       }
       for(int j:arr) {
    	   System.out.println(j);
       }
       String name[]=new String[4];
       name[0]="alex";
       name[1]="bala";
       name[2]="cavin";
       for(String names:name) {
    	   System.out.println(names);
       }

	}

}
