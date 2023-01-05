package Static3;

public class StaticAll {

	static int a = m1();
	
	static
	{
		System.out.println("Static Block");
	}
	
	static int m1()
	{
		System.out.println("Static Method");
		return 10;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		System.out.println("Value of a = "+a);
	}
}

//OUTPUT
//------------
//Static Method
//Static Block
//Main Method
//Value of a = 10

//"static" keyword is very powerful. Normally whenever we run a code
//it's started execution from the Main method. But
//If there is any "static" variable/block/method then the execution
//process will start from them. The sequence will-
//static field/variable => static block => static method => Main method
