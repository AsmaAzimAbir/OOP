package Static2;

public class Employee {

	int id;
	String name;
	
	static String companyName = "Facebook";
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
	void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	
	void displayInfo()
	{
		System.out.println("ID = "+id+"\nName: "+name+"\tCompany name = "+companyName+"\n");
		
	}
}
