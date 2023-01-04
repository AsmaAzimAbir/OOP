package MemoryAllocation;

public class HeapnStackExample {

	public static void main(String[] args) {
	//main method => Stack Memory
		 foo(); //calling foo() method
		 //foo method => Stack Memory
		 
	}
	
	public static void foo()
	{
		int numb = 5;
		//numb 5 => Stack Memory
		bar(numb); //calling bar() method and pass "numb" is argument.
		///bar method => Stack Memory
	}
	
	public static void bar (int a)
	{
		int a1 = 5;
		//a1 5 => Stack Memory
		int a2 = 10;
		//a2 10 => Stack Memory
		Person p1 = new Person(25, 185);
		//p1 => Stack Memory
		//Person object => Heap Memory
		//Age=25 Weight=185 => Heap Memory
		Person p2 = new Person(75, 200);
		//p2 => Stack Memory
		//Person object => Heap Memory
		//Age=75 Weight=200 => Heap Memory
	}
}
