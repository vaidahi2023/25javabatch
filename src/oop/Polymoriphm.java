/*
 * polymoriphm 
 * poly -- many 
 * moriphm --- types /form 
 * 1.complie time polymoriphm 
 * 		---method overloading 
 * 		-- it contain same name but different argument/parmeter
 * 		--it have same class
 * 2.run time polymoriphm 
 * 		--method overriding
 * 		--it inherits parent class method with same name
 * 		--it present in different class
 */

package oop;
class cal 
{
	void sum(int a,int b)
	{
		int sum;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	void sum(int a,int b,int c)
	{
		int sum;	
		sum=a+b+c;
		System.out.println("sum="+sum);
	}
}

public class Polymoriphm {
public static void main(String[] args) {
	

	cal c=new cal();
	c.sum(1, 2);
	cal c1=new cal();
	c1.sum(12, 3,5);
}
}
