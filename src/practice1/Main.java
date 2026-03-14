package practice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department(103,"CSE");
		CSE cs=new CSE();
		cs.displaydetails(d); //passing the objects created for the Department class, into the method of CSE class.
		//method chaining using the current object.
		d.addDept("EEE").addDeptid(109);
		d.display();
		int age=68;
		assert age>=60:"old";
		System.out.println("wrong data");
	}

}
