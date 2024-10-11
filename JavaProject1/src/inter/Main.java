package inter;


class Room implements Building{
	public void room() {
		System.out.println("Thee room number is: 125");
	}
}


public class Main {
	public static void main(String[] args) {
		Room r = new Room();
		r.room();
	}
}
