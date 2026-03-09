package Java_core;
class Theatre{
	String moviename;
	int id;
	Theatre(String name,int id){
		moviename=name;
		this.id=id;
	}
	Theatre(){
		this("anbu",05);
		System.out.println("the paramertized constructor is called by default construtor");

		
	}
	public void printDetails() {
		System.out.println("moviename :"+moviename);
		System.out.println("movieid :"+id);
	}
}
public class Parametrized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre t=new Theatre("davis",101);
		t.printDetails();
		Theatre t1=new Theatre();
		t1.printDetails();
	}

}
