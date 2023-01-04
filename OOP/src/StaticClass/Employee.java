package StaticClass;

public class Employee {

	int id;
	String name;
	
	static String companyName = "Facebook";
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
	static void setCompanyName(String companyName)
	{
		Employee.companyName = companyName;
		//After declaring this method "static"
		//We don't need to  use "this" keyword
		//We can use the class name instead of "this". 
	}
	
	void displayInfo()
	{
		System.out.println("ID = "+id+"\nName: "+name+"\tCompany name = "+companyName+"\n");
		
	}
}
