package Keyword;

/*
 * final -- variable,method,class
 */
final class F 
{
	final void show()
	{
		
	}
}
class FinalK extends F{

	final int x=20;
	 void show()
	{
		System.out.println("final method");
	}
	public static void main(String[] args) {
		
		FinalK f=new FinalK();
		f.show();
		System.out.println("variable="+f.x);
		F f1=new F();
		f1.show();
	}
}

