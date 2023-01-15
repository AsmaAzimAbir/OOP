package Encapsulation;
import java.util.Scanner;

public class Employee {

	private String empName;
	private long empACno;
	private String empEmail;
	private double empBalance;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpACno() {
		return empACno;
	}
	public void setEmpACno(long empACno) {
		this.empACno = empACno;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpBalance() {
		
		System.out.println("Enter your AC name: ");
		Scanner sc = new Scanner(System.in);
		String user_name = sc.nextLine();
		
		System.out.println("Enter your AC no: ");
		long ac_no = sc.nextLong();
		
		
		if(user_name.equals(empName) && ac_no == empACno)
			System.out.println("\n\nYour account balance is: "+empBalance);
		else System.out.println("\n\nWrong Username or AC no");
			
		return empBalance;
	}
	
	public void setEmpBalance(double empBalance) {
		this.empBalance = empBalance;
	}
	
	
	
	
}
