package oop;
class shape 
{
	int length;
	int breadth;
	int radius;
}
class circle extends shape
{
	float pi=3.14f,area;
	circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		area=pi*radius*radius;
		System.out.println("area="+area);
	}
}
class Rectangle extends shape
{
	
	int area=0;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void area()
	{
		area=length*breadth;
		System.out.println("area="+area);
	}
}
public class Hinheritance {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(12,3);
		r.area();
		circle c=new circle(12);
		c.area();
	}
	
}


//vehicle -- model no,color,price,
//car -- no of seats
//Active -- no of wheel


























