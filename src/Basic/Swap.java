package Basic;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		
		int n,temp,first=0,last,m,divisor=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		temp=n;
		last=n%10;
		while(n>10)
		{
			first=n/10;
			divisor=divisor*10;
			n=n/10;
		}
		m=temp%divisor; //remove first digit
		m=m/10; //remove last digit
		
		n=last*divisor+m*10+first;
		
		System.out.println("reversed number ="+n);
		}
	
}
