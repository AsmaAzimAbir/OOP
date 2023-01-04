package StaticClass2;

public class Employee {

	int id;
	String name;
	
	static String companyName = "Facebook";
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	Employee()
	{
		
	}
	
	static void setCompanyName(String companyName)
	{
		Employee.companyName = companyName;
		
		Employee em = new Employee();
		System.out.println(em.id);
		System.out.println(em.name);
		em.displayInfo();
		//We can't access any non-static method or variable from 
		//any static method. If we wanna do that then first we've 
		//to create an object of that class inside the static method.
		//After that we can do it through that object.
		
		//On the other hand, we can access any static method or variable
		//from any non-static method.
	}
	
	void displayInfo()
	{
		System.out.println("ID = "+id+"\nName: "+name+"\tCompany name = "+companyName+"\n");
		
	}
}
