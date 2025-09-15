package Exception;

public class Exception1 {

	
	public static void main(String[] args) {
		
		
//		String a=null;
//		//System.out.println(a.length());
//		try 
//		{
//			System.out.println(a.length());
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		int a=0,div;
		String b="hi";
		try
		{
			System.out.println(b.length());
		//div=b/a;
		//System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("Enter the number  between 1 to 100");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("it is finally block");
		}
		
		
	}
}
