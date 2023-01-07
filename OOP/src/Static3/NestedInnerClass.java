package Static3;

public class NestedInnerClass {

	int x = 10;
	
	static class Inner
	{
		static void msg()
		{
			NestedInnerClass nic = new NestedInnerClass();
			System.out.println("Value of x = "+nic.x);
		}
	}
	
	public static void main(String[] args)
	{
		//Without static on msg() method-
		/*
		NestedInnerClass.Inner i = new NestedInnerClass.Inner();
		i.msg();
		*/
		
		
		//With static on msg() method-
		NestedInnerClass.Inner.msg();
	}
}
