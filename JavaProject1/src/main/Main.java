package main;
import emp.Emp;
import manager.Manager;


public class Main {
	public static void main(String[] args) {
		
		Emp e = new Emp();
		System.out.println(e.calsal(10000));
		
		Manager m = new Manager();
		System.out.println(m.calsal(20000, 5000));
	}
	
}
