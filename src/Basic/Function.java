package Basic;

import java.util.Scanner;

public class Function {

	//without agrumnet without return
//	void sum()
//	{
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		a=s.nextInt();
//		b=s.nextInt();
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}
//	
//	int sum(int a,int b)
//	{
//		int sum;
//		sum=a+b;
//		return sum;
////	}
//	//with argument without return 
//	void sum(int a,int b)
//	{
//		int sum;
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}
	
	//without argument with return
	int sum()
	{
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Function f=new Function();
//		Function f;
		
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		a=s.nextInt();
//		b=s.nextInt();
//		f.sum(a,b);
		
		int sum=0;
		sum=f.sum();
		System.out.println("sum="+sum);
		}
}
