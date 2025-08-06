package oop;

class A{
	
	int id;
	A(int id)
	{
		System.out.println("it is a class constructor");
		this.id=id;
	}
}

class B extends A
{
	int age;
	B(int id,int age)
	{
		super(id);
		this.age=age;
		
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		B b=new B(1,12);
		System.out.println("id="+b.id);
		System.out.println("age="+b.age);
	}

}

//student -- rollno,name,gender
//result-- marks[],per



