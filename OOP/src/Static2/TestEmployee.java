package Static2;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(1234, "Md. Arafat");
		Employee em2 = new Employee(1235, "Shajibur Rahman");
		em1.displayInfo();
		em2.displayInfo();
		
		em1.setCompanyName("Meta");
		
		Employee em3 = new Employee(1236, "Atia Akhi");
		Employee em4 = new Employee(1237, "Fabiha Rahman");
		em3.displayInfo();
		em4.displayInfo();
		
		
		//Now, if I wanna access Employee class's id & name variables then
		//I've to do it through any of that class objects (em1/em2/em3/em4)
		//sysout(em1.id);
		//But, if I wanna access the static variable companyName then-
		//I don't need to do it through any of that class objects.
		//I can do it through the class name. Like-
		//sysout(Employee.companyName);
		
		System.out.println(em1.id);
		System.out.println(em2.name);
		System.out.println(Employee.companyName);
		
		System.out.println(em1.companyName);
	}
}
