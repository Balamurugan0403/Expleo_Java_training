package Java_core;

public class Ifelse{
	public static void main(String[]args) {
	int speed=15;
	boolean max=true;
	if(!max){
		System.out.println("speed is reduced to"+(--speed));
	}
	else{
		System.out.println("speed is not reduced");
	}
}
}