package Basic;

public class Book {

	private String title;
	private String authorname;
	private int price;
	
	Book(String title,String authorname)
	{
		this.title=title;
		this.authorname=authorname;
	}
	Book(String title,String authorname,int price)
	{
		this.title=title;
		this.authorname=authorname;
		this.price=price;
	}
	public static void main(String[] args) {
		
		Book b=new Book("c book","abc");
		Book b1=new Book("java book","xyz",200);
		System.out.println("book name"+b.title);
		System.out.println("book title"+b.authorname);
		System.out.println("book name"+b1.title);
		System.out.println("book title"+b1.authorname);
		System.out.println("book price"+b1.price);
	}
	
	
}
