package Basic;

import java.util.Scanner;

// function
/*
 * datatype functionname(parameters)
 * {
 * 	// stataement 
 * 
 * }
 * types of function
 * 1.without argument without return
 * 2.with argument with return 
 * 3.with argument iwthout return
 * 4.without argument with return
 */
public class Function1 {

//	//without argument without return
//	void sum()
//	{
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number");
//		a=s.nextInt();
//		b=s.nextInt();
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}
//	
//	//with argument with return
//	int sum(int a,int b)
//	{
//		int sum=0;
//		sum=a+b;
//		return sum;
//	}
	
	//without argument with return
	int sum()
	{
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		return sum;
		
	}
	
	//with argument without return
	void sum(int a,int b)
	{
		int sum;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		
		Function1 f=new Function1();
//		f.sum();
		int a,b,s1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		a=s.nextInt();
		b=s.nextInt();
//		s1=f.sum(a,b);
//		int sum=0;
//		sum=f.sum();
//		System.out.println("sum="+sum);
		f.sum(a,b);
	}
	
	
}
