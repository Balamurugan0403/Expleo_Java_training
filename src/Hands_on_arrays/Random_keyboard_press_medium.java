package Hands_on_arrays;
import java.util.*;
public class Random_keyboard_press_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[25];
		System.out.println("Enter the numbers:");
		for(int i=0;i<25;i++) {
            arr[i] = sc.nextInt();
        }
		System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        int count = 0;
        for(int i=0;i<25;i++) {
        	if(arr[i] == key) {
                count++;
            }
        }

        if(count > 0) {
            System.out.println("It appears "+count+" times");
        }
        else {
            System.out.println("Number not found");
        }
	}

}
