package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Avgofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> s=new TreeSet<>();
		while(true) {
			System.out.println("Enter a number (or type 'done' to finish):");
			String num=sc.next();
			if(num.equalsIgnoreCase("done")) {
				break;
			}
			int number=Integer.parseInt(num);
			s.add(Integer.valueOf(number));
		}
		System.out.print("Sorted unique numbers:");
		System.out.println(s);
		int sum=0;
		for (int num : s) {
            sum += num;
        }
		float avg=(float)sum/s.size();
		System.out.println("Average:"+avg);
		System.out.println("Lowest:"+s.first());
		System.out.println("Highest:"+s.last());
		List<Integer> oddList = new ArrayList<>();
        for (int n : s) {
            if (n % 2 != 0) {
                oddList.add(n);
            }
        }

        System.out.println("Odd numbers: " + oddList);


	}

	
}
