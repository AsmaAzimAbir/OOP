package ThisKeyword;

public class Student {

	int id, age;
	String name, address;
	double fee;
	
	//Constructor #1
	Student(int id, String name, int age, String address) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//Constructor #2
	Student(int id, String name,int age, String address, double fee) 
	{
		this(id, name, age, address);
		/*
		 This is the implementation of-
		 this() can be used to invoke current class constructor. 
		 
		 We initialise id, name, age & address field using 
		 'this' keyword inside the 1st constructor. But inside 
		 the 2nd constructor we didn't do that. We just call the 
		 1st constructor using 'this' keyword and pass 4 arguments. 
		 Though, those 4 fields was common in both constructors so, 
		 we can do it. 
		*/
		this.fee = fee;
	}
	
	void showInfo()
	{
		System.out.println(id+" "+name+" "+age+" "+address+" "+fee);
	}
	
	
	
}
