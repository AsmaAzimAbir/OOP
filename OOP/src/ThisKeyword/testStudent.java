package ThisKeyword;

public class testStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(181, "Asma Azim", 26, "YKSG-1, room #W-303");
		s1.showInfo();
		
		Student s2 = new Student(183, "Arafat Hossain", 24, "YKSG-2, room #E-603", 500.0);
		s2.showInfo();
	}
}
