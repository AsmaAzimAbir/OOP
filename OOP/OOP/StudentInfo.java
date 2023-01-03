package OOP;

public class StudentInfo {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.SetSInfo(181, "Asma_Azim_Abir", "CSE");
		
		/*
		st.id = 181;
		st.name = "Asma";
		st.dept = "CSE";
		*/
		
		st.ShowOutput();
	}
}
