package oop;
//interface is like class
//interface --public ,static
//interface we can only declare the method  
//interface object will not created 
interface I1
{
	void fun();
}
interface I2
{
	void write();
}
class E implements I1,I2
{

	
	public void write() {
		System.out.println("it is interface 1 method");
	}

	public void fun() {
		
		System.out.println("it is interface 2 method");
	}
	
}
public class Multipleinheritance {

	public static void main(String[] args) {
		
		E e=new E();
		e.fun();
		e.write();
	}
}


//camera --takephoto()
//maps-- locate()
//class phone























