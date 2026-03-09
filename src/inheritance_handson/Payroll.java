package inheritance_handson;

import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PermanentEmployee pe = null;
		ContractEmployee ce = null;
		Intern i = null;
		while (true) {
			System.out.println("1. Add Permanent Employee");
			System.out.println("2. Add Contract Employee");
			System.out.println("3. Add Intern Employee");
			System.out.println("4. List Employee detials");
			System.out.println("5. Calculate Salary of the Employee");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice:");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Employee Base Salary:");
				double baseSal = sc.nextDouble();
				System.out.println("Enter Employee Bonus:");
				double bonus = sc.nextDouble();

				pe = new PermanentEmployee(id, name, baseSal, bonus);
				System.out.println("Permanent Employee added Successfully");

			} else if (choice == 2) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Employee Base Salary:");
				double baseSal = sc.nextDouble();
				System.out.println("Enter Tax Rate(0.10 for 10%):");
				double taxrate = sc.nextDouble();
				System.out.println("Enter Service Charge:");
				double service = sc.nextDouble();

				ce = new ContractEmployee(id, name, baseSal, taxrate, service);
				System.out.println("Contract Employee added Successfully");

			} else if (choice == 3) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Stipend:");
				double stipend = sc.nextDouble();

				i = new Intern(id, name, stipend);
				System.out.println("Intern Employee added Successfully");

			} else if (choice == 4) {
				if (pe == null && ce == null && i == null) {
					System.out.println("Employee Detials are null");
				}
				if (pe != null) {
					System.out.println("-------------------------");
					System.out.println(pe.toString());
					System.out.println("-------------------------");
				}
				if (ce != null) {
					System.out.println(ce.toString());
					System.out.println("-------------------------");
				}
				if (i != null) {
					System.out.println(i.toString());
					System.out.println("-------------------------");
				}
			} else if (choice == 5) {
				System.out.println("Enter Employee Id:");
				String id = sc.next();

				if (pe != null && pe.getEmpId().equals(id)) {
					System.out.println("Permanent Employee: " + pe.calculateSalary());
				}
				if (ce != null && ce.getEmpId().equals(id)) {
					System.out.println("Contract Employee: " + ce.calculateSalary());
				}
				if (i != null && i.getEmpId().equals(id)) {
					System.out.println("Intern Employee: " + i.calculateSalary());
				}
			} else if (choice == 6) {
				break;
			} else {
				System.out.println("Enter Valid Choice");
			}
		}
		sc.close();
	}
}