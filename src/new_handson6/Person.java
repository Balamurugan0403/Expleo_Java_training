package new_handson6;

public class Person {
	String name;
	String address;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person[name=" + name + ", address=" + address + "]";
	}
}
