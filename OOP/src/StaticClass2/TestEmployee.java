package StaticClass2;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(1234, "Md. Arafat");
		em1.displayInfo();
		
		
		Employee.setCompanyName("Meta");
		
		Employee em3 = new Employee(1236, "Atia Akhi");
		em3.displayInfo();
	}
		
}
