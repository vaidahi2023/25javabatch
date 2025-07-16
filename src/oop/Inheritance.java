package oop;
// inheritance is the process of inheriting all the properties of parent class to child class
//types inheritance
//* single inheritance
//* multilevel inheritance
//* multiple inheritance
//* hybrid inheritance
//* hiericahical inheritance

class Parent 
{
	int id;
	private String name;
	void print()
	{
		System.out.println("it is parent class method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Child extends Parent 
{
	void print1()
	{
		System.out.println("it is child class method");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		
		Child c=new Child();
		c.setName("riya");
		c.id=12;
		c.print();
		c.print1();
		System.out.println("id="+c.id);
		System.out.println("name="+c.getName());
	}
}
