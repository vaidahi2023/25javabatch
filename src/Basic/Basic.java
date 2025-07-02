package Basic;

import java.util.Scanner;

/*
 * int 
 * float
 * double 
 * String 
 * char
 */
public class Basic {

	public static void main(String[] ar) {
		
		Scanner s=new Scanner(System.in);
		int b,c=20,sum=0;
		System.out.println("Enter the number");
		b=s.nextInt();
		System.out.println("b="+b);
		System.out.println("b+c="+(b+c));
		sum=b+c;
		System.out.println("sum="+sum);
		
	}	
}
