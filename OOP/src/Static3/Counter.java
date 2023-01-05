package Static3;

public class Counter {

	static int count = 0;
	//If I don't  use the "static" before int count then the output of this program will-
	//Count = 1 \nCount = 1 \nCount = 1
	//Cause, inside out main method we've created 3 object for the Counter class. And 
	//every time for every single object's in Heap memory a specific space had been created.
	//That's why when we run this program, the value of "count" increase 0 to 1.
	
	//After using the "static" keyword-
	//When we run this program the JVM load the count value as 0 and
	//it will create a common memory/shared memory for count.
	//Because of this, when we run this program-
	//for 1st object the value of count will 0+1 = 1
	//for 2nd object the value of count will 1+1 = 2
	//and for 3rd object the value of count will 2+1 = 3
	
	Counter()
	{
		++count;
	}
	
	void showCount()
	{
		System.out.println("Count = "+count);
	}
	
	public static void main(String[] args)
	{
		Counter ct1 = new Counter();
		ct1.showCount();
		Counter ct2 = new Counter();
		ct2.showCount();
		Counter ct3 = new Counter();
		ct3.showCount();
	}
}
