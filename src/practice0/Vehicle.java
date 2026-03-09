package practice0;

class Vehicle {
	int wheels=8;
	String model="rare";
	public void makeSound() {
		System.out.println("Vehicles can make horn sound");
	}
	
}
class Car extends Vehicle{
	int wheels;
	String model;
	Car(String model){
		this.model=model;
	}
	public void makeSound() {
		System.out.println("No of wheels: "+super.wheels);//using the parent class attributes.
		System.out.println(model+" makes the Roar sound");
		super.makeSound();//Calling the method of the parent class in the child class.
	}
	
}
