package Exception;

public class Exception2 {


	public static void  validage(int age) throws IllegalArgumentException
	{
		if(age<18)
		{
			throw new IllegalArgumentException("you are not eligible");
		}
		else 
		{
			System.out.println("you are eligible");
		}
	}
	public static void main(String[] args) {
		
		try
		{
			validage(15);
		}catch (IllegalArgumentException e) {
			System.out.println("message="+e.getMessage());
		}
	}
}



//
//str="hello"
//char ch;
// for(i=0;i<str.length;i++)
// {
//	 boolean present=false
//	 ch=str.charAt(i);
//	 String v="aeiou";
//	 if(v.contains(String.valueof(ch)))
//	 {
//		 	present =true;
//		 	break;
//	 }
//   }
// 






// }