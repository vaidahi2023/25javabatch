package Basic;
//constructor is like method
//
public class Demo {
	int id;
	String name;
	void display()
	{
		System.out.println("display method...");
		System.out.println("id="+id+"name="+name);
	}
//	Demo()
//	{
//		System.out.println("constructor call ");
//	}
	Demo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		
		Demo  d=new  Demo(1,"riya");
//		d.id=1;
//		d.name="riya";
		System.out.println("id="+d.id+"name="+d.name);
		d.display();
		 Demo d1=new Demo();
		 d1.id=2;
		 d1.name="smit";
		 System.out.println("id="+d1.id+"name="+d1.name);
		d1.display();
		
	}
}
