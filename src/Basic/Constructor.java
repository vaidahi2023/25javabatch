package Basic;

public class Constructor {

	private int id;
	Constructor(int id)
	{
		this.id=id;
	}
	Constructor(Constructor c) {
		
		this.id=c.id;
	}
	public static void main(String[] args) {
		
		
		Constructor c=new Constructor(3);
		Constructor c1=new Constructor(c);
		
		System.out.println("c id"+c.id);
		System.out.println("c1 id="+c1.id);
		
	}
}