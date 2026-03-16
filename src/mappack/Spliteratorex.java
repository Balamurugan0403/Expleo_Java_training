package mappack;

import java.util.ArrayList;
import java.util.Spliterator;

public class Spliteratorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> arr = new ArrayList<Double>();
		System.out.println("initial size of array:" + arr.size());
		arr.add(1.2);
		arr.add(2.2);
		arr.add(3.2);
		arr.add(4.2);
		arr.add(5.2);
		arr.add(6.2);
		System.out.println("Contents of the ArrayList using tryAdvance:");

		Spliterator<Double> sitr = arr.spliterator();

		while (sitr.tryAdvance((n) -> System.out.println(n + " ")));
		System.out.println();
		sitr = arr.spliterator();
		System.out.println("Using forEachRemaining:");
		sitr.forEachRemaining((n) -> System.out.println(n + " "));
		System.out.println("Size: " + arr.size());

	}

}
