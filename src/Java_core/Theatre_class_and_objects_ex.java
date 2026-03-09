package Java_core;

public class Theatre_class_and_objects_ex {
public static void displayTheatre() {
		
		String theatrename = null;
		System.out.println("Theatreid :"+theatrename);
		String theatrelocation = null;
		System.out.println("Theatrelocation: "+theatrelocation);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=123435;
		String theatrename="inox";
		String theatrelocaton="cochin";
		displayTheatre();
		

	}
	

	

}
class Java extends Theatre_class_and_objects_ex{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=123435;
		String theatrename="inox";
		String theatrelocaton="cochin";
		displayTheatre();
		Java j=new Java();
		j.displayTheatre();
		

	}


}
