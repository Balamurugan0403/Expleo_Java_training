package serialize;

import java.io.*;

public class Employee implements Serializable {

	int empid;
	String empname;

	// Constructor
	Employee(int id, String name) {
		this.empid = id;
		this.empname = name;
	}

	public static void main(String[] args) {

		Employee obj = new Employee(1, "Ram");
		String filename = "file.ser";
		System.out.println(new File(filename).getAbsolutePath());
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(obj);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		Employee object1 = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object1 = (Employee) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized");

			System.out.println("Employee Id: " + object1.empid);
			System.out.println("Employee name: " + object1.empname);

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}