package thisKeyword2;

//6) this can be used to return the current class instance from the method

class ABC {
	
	public ABC getABCobj()
	{
		
		return this;
	}
	
	void displayInfo()
	{
		System.out.println("Method is successfully invoked...\n");
	}
	
}


public class Test3 {
	
	public static void main(String[] args) {
		
		ABC abc = new ABC();
		ABC abc1 = abc.getABCobj();
		//We are storing the object to abc1 reference.
		
		
		System.out.println("Hash code of (abc) = " +abc);
		System.out.println("Hash code of (abc1) = " +abc1);
	}
}
