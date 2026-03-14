package access_modifi_1;

public class Access_2 {

	protected String empname1="ravi";
    protected int empID1=101;
    
    public String empname2="mohan";
    public int empID2=102;
    
    String empname3="raju";
    int empID3=104;
    
    private String empname4="ranu";
    private int empID4=104;
    
    public String getEmpname4() {
        return empname4;
    }

    public int getEmpID4() {
        return empID4;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a=new Access1();
		System.out.println("Same package using protected:");
		System.out.println("age:"+a.age);
		System.out.println("weight:"+a.weight);
		
		Access_3 a3=new Access_3();
		a3.childmethod();

	}

}
class Access_3 extends Access_2{
	void childmethod() {
		System.out.println("\nChild class using protected:");
		System.out.println("empname:"+empname1+"\nempId:"+empID1);
		
		System.out.println("\nChild class using public:");
		System.out.println("empname:"+empname2+"\nempId:"+empID2);
		
		System.out.println("\nChild class using default:");
		System.out.println("empname:"+empname3+"\nempId:"+empID3);
		
		System.out.println("\nChild class using private:");
		System.out.println("empname:"+getEmpname4()+"\nempId:"+getEmpID4());
	}
}
