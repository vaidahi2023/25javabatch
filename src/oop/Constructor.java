package oop;

public class Constructor {

	private int id;
	private String name;
	private String subjects[];
	Constructor(int id)
	{
		this.id=id;
	}
	public Constructor(int id,String name,String subjects[]) {
		
		this.id=id;
		this.name=name;
		this.subjects=subjects;
	}
//	Constructor(Constructor c) {
//		
//		this.id=c.id;
//	}
	public static void main(String[] args) {
		
		
		String sub[]= {"hindi","science","ss"};
		Constructor c=new Constructor(3,"riya",sub);
		Constructor c1=new Constructor(4);
		
		System.out.println("c id"+c.id);
		System.out.println("c1 id="+c1.id);
		System.out.println("c name"+c.name);
		//System.out.println("subjects"+c.subjects);
		for(String s:c.subjects)
		{
			System.out.println(s);
		}
		
	}
}