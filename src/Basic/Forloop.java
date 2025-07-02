package Basic;
/*
 * types of loop
 * 1.entry control loop
 * for 
 * while
 * 2.exit control loop
 * do while
 */

import java.util.Scanner;

public class Forloop {

	
	public static void main(String[] args) {
	
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
