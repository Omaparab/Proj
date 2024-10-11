package Pack2;

class Department{
	void Emp() {
		System.out.println("Employee got a bonus");
	}
	
	void Emp(String timeline) {
		System.out.println("Employee is assigned with new work deadline date: " + timeline);
	}
}

class Section extends Department {
	void Emp() {
		System.out.println("Employee bonus was cancelled");
	}
}


public class Main2 {
	public static void main(String[] args) {
		Department d = new Department();
		d.Emp();
		d.Emp("30th October");
		
		Section s = new Section();
		s.Emp();
	}
}
