package oop;

interface Person 
{
	void drive(int a);
}
interface Teacher extends Person
{
	void teach();
}
interface Student1 extends Person 
{
	void drift(int a);
}
class school implements Student1,Teacher
{

	public void drive(int speed) {
		System.out.println("speed "+speed);
	}


	public void drift(int turn) {
		System.out.println("turn "+turn);
	}


	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}


	
}
public class Hybridinheritance1 {

	public static void main(String[] args) {
		
		school s=new school();
		s.drift(10);
		s.drive(90);
		
	}
}
