package oop;
class A3
{
	int n=100;
	void display()
	{
		System.out.println("it is parent class method");
	}
	
}
class B3 extends A3
{
	int n=200;
	void display()
	{
		super.display();
		System.out.println("it is child class method");
		System.out.println("n="+n);
		System.out.println("n="+super.n);
	}
}

public class Runpolymoriphm {
	public static void main(String[] args) {
		
		B3 b=new B3();
		b.display();
		
		
	
	}

}
