package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Mobile implements Comparable <Mobile> {
	private String name;
	private int ram;
	private int price;
	Mobile(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	String getName() {
		return name;
	}
	int getram() {
		return ram;
	}
	int getprice() {
		return price;
	}
	void setRam(int ram) {
		this.ram=ram;
	}
	void setName(String name) {
		this.name=name;
		
	}
	void setPrice(int price) {
		this.price=price;
	}
	public int compareTo(Mobile o) {
		if(this.ram>o.getram()) {
			return 1;
		}
		else {
			return -1;
		}
	}
public class ComparableExample{
	public static void main(String []args) {
		List<Mobile> mobilelist=new ArrayList<>();
		mobilelist.add(new Mobile("redmi",32,1000));
		mobilelist.add(new Mobile("samsung",2,1000));
		mobilelist.add(new Mobile("redi",16,1000));
		mobilelist.add(new Mobile("redmi",5,1000));
		Collections.sort(mobilelist);
		System.out.println("mobile after sorting");
		System.out.println("name"+"\t"+"ram"+"\t"+"price");
		for(Mobile mb:mobilelist) {
			System.out.println(mb.getName()+"\t"+mb.getram()+"\t"+mb.getprice());
		}
	}

}
