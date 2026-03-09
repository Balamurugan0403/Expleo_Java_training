package inheritance_handson;

public class ContractEmployee extends Employee {
	double taxRate;
	double serviceCharge;

	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	@Override
	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}

	@Override
	public String toString() {
		return "ContractEmployee [taxRate=" + taxRate * 100 + ", serviceCharge=" + serviceCharge + ", empId=" + empId
				+ ", empName=" + empName + ", baseSalary=" + baseSalary + "]";
	}

}
