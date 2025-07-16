package oop;
//
class Example1
{
	private int id;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Example1 e=new Example1();
		e.setid(1);
		int id;
		id=e.getid();
		System.out.println("id="+id);
		System.out.println("id="+e.getid());
	}
}
