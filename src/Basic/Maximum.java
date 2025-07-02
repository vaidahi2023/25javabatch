package Basic;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		
		int size,i,max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		size=s.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(i=0;i<size;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
			System.out.println(a[i]);
		}
		System.out.println("maximum number="+max);
		
	}
	
}
