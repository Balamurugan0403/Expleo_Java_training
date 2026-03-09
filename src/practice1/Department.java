package practice1;

public class Department {
	int deptID;
	String deptName;
	int newdeptid;
	String newDept;
	Department(int deptid,String deptname){
		deptID=deptid;
		deptName=deptname;
		
	}
	Department addDept(String name) {
		this.newDept=name;
		System.out.println("department is added");
		return this;
		
	}
	Department addDeptid(int id) {
		this.newdeptid=id;
		return this;
		  
	}
	void display() {
		System.out.println("new deptid:"+newdeptid+"\nnew dept name:"+newDept);
	}
}
class CSE{
	int DepartID;
	String Departname;
	void displaydetails(Department d) {
		System.out.println("Department ID:"+d.deptID);//but these two attributes we get from the Department class without inherutance.
		System.out.println("Department Name:"+d.deptName);
	}
}
