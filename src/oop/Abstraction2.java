package oop;
interface I1 
{
    public String name="";
	void display();
//	void study()
//	{
//		System.err.println("it is study method");
//	}
}
class Demo3 implements I1
{

	@Override
	public void display() {
	
		System.out.println("Demo3.display()");
	}
	
}
public class Abstraction2 {
public static void main(String[] args) {
	

	Demo3 d=new Demo3();
	d.display();
}
}
