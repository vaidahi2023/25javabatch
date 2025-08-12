package Keyword;
//static -- variable,method,block

public class Static {

	static  int a=10;
	static void display()
	{
		System.out.println("it is static method");
	}
	static
	{
		System.out.println("it is static block");
	}
	public static void main(String[] args) {
		
		Static s=new Static();
		System.out.println("static variable="+s.a);
		s.a=12;
		System.out.println("static variable="+s.a);
		Static s1=new Static();
		System.out.println("static variable="+s1.a);
		System.out.println("static value without object="+a);
		s.display();
		s1.display();
		display();
	}
	
}
