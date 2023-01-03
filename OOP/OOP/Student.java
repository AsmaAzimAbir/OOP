package OOP;

public class Student {
	
	String name, dept;
	int id;
	
	void SetSInfo(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		
		//System.out.println("\nID = "+id+"\nName = "+n+"\nDepartment = "+d);
	}
	
	
	void ShowOutput()
	{
		System.out.println("\nID = "+id+"\nName = "+name+"\nDepartment = "+dept);
	}
	

}
