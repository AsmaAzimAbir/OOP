package Static;

public class Employee {

	int id;
	String name;
	
	static String companyName = "Apex";
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
	void displayInfo()
	{
		System.out.println("ID = "+id+"\nName: "+name+"\tCompany name = "+companyName+"\n\n");
		
	}
}
