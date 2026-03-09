package Java_core;
import java.util.Scanner;
public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        Scanner sc=new Scanner(System.in);
        
        
      
        int ar[][]=new int[3][];
        for(int i=0;i<ar.length;i++) {
        	int n=sc.nextInt();
        	ar[i] = new int[n];
        	for(int j=0;j<ar[i].length;j++) {
        		ar[i][j]=sc.nextInt();
        		
        	}
        	
        }
        for(int i=0;i<ar.length;i++) {
        	for(int j=0;j<ar[i].length;j++) {
        		System.out.print(ar[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
