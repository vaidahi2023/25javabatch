package oop;

public class Student {

	private int id;
	private String name;
	private int marks[];
	Student(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("id ="+id);
		System.out.println("name="+name);
		System.out.println("marks of subjects");
		for(int m:marks)
		{
			System.out.println(m);	
		}
	}
	public static void main(String[] args) {
		
		int marks[]= {12,14,16,89,90};
		Student s=new Student(1,"riya",marks);
		s.display();
	}
}
