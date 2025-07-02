package Basic;

import java.util.Scanner;

public class Example {
  int id;
  String name;
  void print()
  {
	  System.out.println("id="+id);
	  System.out.println("name="+name);
  }
	public static void main(String[] args) {
		
		//classname object name =new classname();
		Example e=new Example();
		e.id=1;
		e.name="smit";
		e.print();
		
		Scanner s=new Scanner(System.in);
		Example e1=new Example();
		System.out.println("Enter the id:");
		e1.id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the name:");
		e1.name=s.nextLine();
		e1.print();
	}
	
}
