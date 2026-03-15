package serilizable_ex2;

import java.io.*;

public class Employee1 implements Serializable {

    private static final long serialVersionUID = 129348938L;

    transient int empId;
    static int deptId;
    String empName;
    int empAge;

    public Employee1(String name, int age, int id, int deptid) {
        empName = name;
        empAge = age;
        empId = id;
        deptId = deptid;
    }

    public static void printdata(Employee1 object) {
        System.out.println("empName = " + object.empName);
        System.out.println("empAge = " + object.empAge);
        System.out.println("empId = " + object.empId);
        System.out.println("deptId = " + object.deptId);
    }

    public static void main(String[] args) {

        Employee1 object = new Employee1("Ram", 29, 2, 1000);
        String filename = "Ram.txt";

        try {
            // Serialization
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println("Data before Deserialization:");
            printdata(object);

            object.deptId = 2000;  
            object.empAge = 100;    

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        try {
            // Deserialization
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object = (Employee1) in.readObject();

            in.close();
            file.close();

            System.out.println("\nObject has been deserialized");
            System.out.println("Data after Deserialization:");
            printdata(object);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}