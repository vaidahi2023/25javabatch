package Basic;
//A constructor is a special block of code that is called when an object is created. Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes. 
//This process happens automatically when we use the "new" keyword to create an object.
//constructor is same like method but constructor does not use datatype 
//constructor name  is same name of class 
//types of constructor
/* 1.default  constructor 
* 2.parameterized constructor 
* 3.copy constructor 
*/
public class Constructor1 {

	int id;
	//default constructor
	Constructor1() {
	System.out.println("default constructor");
	}
	
	Constructor1(int id)
	{
		this.id=id;
	}
	
	public static void main(String[] args) {
		
		Constructor1 c=new Constructor1();
		Constructor1 c1=new Constructor1(1);
		System.out.println("id="+c1.id);
		System.out.println("id="+c.id);
	}
}
