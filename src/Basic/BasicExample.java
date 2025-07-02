package Basic;

import java.util.Scanner;

/*java ---.java
 * it jvm --java virtual machine 
 *  int 
 *  double 
 *  float
 *  string
 *  char
 *  
*/
public class BasicExample {

	public static void main(String[] arg) {
		
		int a=10;
		System.out.println("a="+a);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		a=s.nextInt();
		double d;
		System.out.println("Enter the value:");
		d=s.nextDouble();
		String st;
		System.out.println("enetre the string");
		st=s.next();
		System.out.println(a+d+st);
		char ch;
	}
	
}
