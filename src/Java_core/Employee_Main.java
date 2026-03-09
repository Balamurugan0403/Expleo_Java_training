package Java_core;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee emp[]=new Employee[2];
		for(int i=0;i<2;i++) {
			emp[i]=new Employee();
			
		}
		emp[0].setEmployeedetails("ram",6);
		emp[1].setEmployeedetails("sam",1);
		emp[0].getEmployeedetails();
		emp[1].getEmployeedetails();
		
		
//		for(int i=0;i<2;i++) {
//			emp[i].getEmployeedetails();
//		}
		
	}

}
class Employee{
	String name;
	int empid;
	public void setEmployeedetails(String name,int id){
		
			
	this.name=name;
	this.empid=id;
		
	}
	public void getEmployeedetails() {
		System.out.println(name);
		System.out.println(empid);
	}
}

