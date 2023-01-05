package Static3;

public class NestedInnerClass {

	static int x = 10;
	
	static class Inner
	{
		static void msg()
		{
			System.out.println("Value of x = "+x);
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
