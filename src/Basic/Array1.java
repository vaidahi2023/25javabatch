package Basic;

// 12 4 5 2 30
//4 12 5 2 30
//4 5 12 2 30
//4 5 2 12 30

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		
//		int a[]= {1,22,3,4,5};
//		//System.out.println(a[0]);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		int a[]=new int[5];
//		a[0]=1;
//		a[1]=2;
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the elements:");
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=s.nextInt();
//		}
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
		
		
		
		
			int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
			int odd[] = new int[5];
			int even[] = new int[5];
			int e = 0, o = 0, sum = 0;

			
			System.out.println("start");
			e = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 0) {

					System.out.println("if " + a[i]);
					even[e] = a[i];
					e++;
				} 
				else {
					System.out.println("else");
					odd[o] = a[i];
					o++;
				}
			}
			System.out.println("Even elements");
			for(int i:even)
			{
				System.out.println(i);
			}
			
			for(int i:odd)
			{
				System.out.println(i);
			}
		
	}
	
}
