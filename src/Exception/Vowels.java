package Exception;

import java.util.Scanner;

public class Vowels {
	
	public static void checkvowel(String str)throws IllegalArgumentException
	{
		char ch;
		String vowels="aeiou";
		boolean present=false;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(vowels.contains(String.valueOf(ch)))
			{
				present=true;
				break;
			}
		}
		if(present)
		{
			throw new IllegalArgumentException("vowels is present");
		}
		else 
		{
			System.out.println("vowels is not present");
		}
	}
	
	public static void main(String[] args) {
		
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		s1=s.nextLine();  
		try
		{
			checkvowel(s1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
