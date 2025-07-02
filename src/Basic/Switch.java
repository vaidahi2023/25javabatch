package Basic;

import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		
		int a=12,b=13,choice,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice:");
		choice=s.nextInt();
		switch (choice) {
		case 1:
			sum=a+b;
			System.out.println("sum="+sum);
			break;
		case 2:
			sum=a-b;
			System.out.println("sub="+sum);
			break;
		default:
			break;
		}
	}
}
