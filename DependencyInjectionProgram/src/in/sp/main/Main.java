package in.sp.main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hii");
		Address  address=new Address("Bangalore","Karnataka");
		Student student=new Student("Ram",address);
		System.out.println(student);
	}

}
