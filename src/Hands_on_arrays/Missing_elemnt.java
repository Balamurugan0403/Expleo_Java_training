package Hands_on_arrays;
import java.util.Scanner;
public class Missing_elemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int arr[]= {1,2,3,4,5,6,7,8,9,10,
	    		    11,12,13,15,16,17,18,19,20,
	    		    21,22,23,24,25,26,27,28,29,30, 
	    		    31,32,33,34,35,36,37,38,39,40,
	    		    41,42,43,44,45,46,47,48,49,50};	
	    int n=50;
	    int expected_sum=(n*(n+1))/2;
	    int sum=0;
	    for(int i=0;i<arr.length;i++) {
	    	sum=sum+arr[i];
	    }
	    int missing_number=expected_sum-sum;
	    System.out.println("Missing number is:"+missing_number);
	}

}
