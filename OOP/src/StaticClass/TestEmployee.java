package StaticClass;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(1234, "Md. Arafat");
		Employee em2 = new Employee(1235, "Shajibur Rahman");
		em1.displayInfo();
		em2.displayInfo();
		
		Employee.setCompanyName("Meta");
		//After declaring setCompanyName() method as static
		//no need to call that method through any object
		//We can directly call them through their class name.
		
		Employee em3 = new Employee(1236, "Atia Akhi");
		Employee em4 = new Employee(1237, "Fabiha Rahman");
		em3.displayInfo();
		em4.displayInfo();
		
	}
		
}
