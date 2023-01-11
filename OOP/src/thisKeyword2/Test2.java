package thisKeyword2;
//5) this can be passed as argument in the constructor call.

class XYZ {
	
	Test2 test2; //Reference type of public class Test2
	
	//Constructor
	XYZ(Test2 x)
	{
		test2 = x;
	}
	
	void displayInfo()
	{
		System.out.println(test2.a);
	}
}

public class Test2 {
	
	int a = 5;
	
	//Constructor
	public Test2() {
		
		XYZ xyz = new XYZ(this); 
		//We have to give an object reference in here.
		//We can do it through 'this' keyword
		xyz.displayInfo();
	}

	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		//Creating an object of Test2 class +
		//Calling Test2() constructor. 
		
	}
}
