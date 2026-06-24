package in.sp.main;

public class Student {
	private String name;
	private Address address;
	public String getNameString() {
		return name;
	}
	public void setNameString(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [nameString=" + name + ", address=" + address + "]";
	}
	

}
