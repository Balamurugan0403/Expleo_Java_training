package inheritance_handson;

public class PermanentEmployee extends Employee {
	double bonus;

	PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [bonus=" + bonus + ", empId=" + empId + ", empName=" + empName + ", baseSalary="
				+ baseSalary + "]";
	}

}
