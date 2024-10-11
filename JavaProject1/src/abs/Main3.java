package abs;

abstract class Person{
	abstract void Name();
}

class Emp extends Person{
	public void Name() {
		System.out.println("Name: John");
	}
}

public class Main3 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.Name();
	}
}
