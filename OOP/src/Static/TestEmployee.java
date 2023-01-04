package Static;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(1234, "Md. Arafat");
		Employee em2 = new Employee(1235, "Shajibur Rahman");
		
		em1.displayInfo();
		em2.displayInfo();
	}
}
