package thisKeyword2;

//4) this can be passed as an argument in the method call

public class Test1 {
	
	
	void m1(Test1 x)
	{
		System.out.println("m1() method is invoked successfully....\n");
	}
	
	void n1()
	{
		m1(this);
	}
	
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.n1();
		
	}

}
