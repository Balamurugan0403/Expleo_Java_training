package inheritance_handson;

public class Intern extends Employee {
	double stipend;

	Intern(String empId, String empName, double stipend) {
		super(empId, empName, stipend);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}

	@Override
	public String toString() {
		return "Intern [stipend=" + stipend + ", empId=" + empId + ", empName=" + empName + "]";
	}

}
