package oop;

//abstraction is the process that hide the implematation and display essential details
//two way to implement abstraction
//1.abstract class
//2.interface
abstract class  Demo1
{
	abstract void display();
	void write() {
		System.out.println("it is write method");
	}
}
class D2 extends Demo1
{
	void display()
	{
		System.out.println("it is display method");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		D2 d=new D2();
		d.display();
		//d.write();
		
	}
}
