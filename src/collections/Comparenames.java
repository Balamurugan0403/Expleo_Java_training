package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparenames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Priscilla", "Wagner"));
        list.add(new Person("Tom", "Parker"));
        list.add(new Person("Elvis", "Presley"));
        
        Collections.sort(list);

        System.out.println("Sorted people by first name:");
        for (Person p : list) {
            System.out.println(p);
        }
	}}

		class Person implements Comparable<Person> {
		    String firstName;
		    String lastName;

		    Person(String firstName, String lastName) {
		        this.firstName = firstName;
		        this.lastName = lastName;
		    }

		    public int compareTo(Person p) {
		        return this.firstName.compareTo(p.firstName);
		    }

		    public String toString() {
		        return firstName + " " + lastName;
		    }
		}

	