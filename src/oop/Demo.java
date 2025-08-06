package oop;

interface example1
{
	default void fun()
	{
		System.out.println("this interface method");
	}
	int sum(int a,int b);
}
class example2 implements example1
{
	public int sum(int a, int b) {
		
		int add=a+b;
		return add;
	}
	
}
 class Demo {
public static void main(String[] args) {
	
	

	example2 e=new example2();
	System.out.println(e.sum(1, 20));
	e.fun();
}
}