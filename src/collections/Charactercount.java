package collections;

import java.util.HashMap;
import java.util.Map;

public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Write Java code to define yet another Set s. Insert 3 floating point numbers in s, and using an iterator, find the sum of the numbers in s.";

		char[] charsToCount = { 'a', 'c', 'o', 's' };

		Map<Character, Integer> countMap = new HashMap<>();

		for (char ch : charsToCount) {
			countMap.put(ch, 0);
		}
		for (char ch : text.toCharArray()) {
			ch = Character.toLowerCase(ch); // ignore case
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			}
		}
		System.out.println("Character counts:");
		for (char ch : charsToCount) {
			System.out.println(ch + ": " + countMap.get(ch));
		}
	}

}
