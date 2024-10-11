package Pack1;

class Emp{
	String name;
	int id;
	int salary;
	String address;
	
	void input(String n, int i, int s, String a) {
		name = n;
		id = i;
		salary = s;
		address = a;
	}
	
	void display() {
		System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary + "\nAddress: " + address);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	
}

public class Main1 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.input("John", 120, 30000, "France");
		e.display();
		System.out.println(e.toString());
	}
	


	
}
