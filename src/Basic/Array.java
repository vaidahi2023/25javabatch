package Basic;

public class Array {

	public static void main(String[] args) {
		
		
//		int a[]= {1,2,3,4,5},sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//			System.out.println(a[i]);
//		}
//		System.out.println("sum="+sum);
	
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		a[3]=40;
		a[4]=30;
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
		
		
	}
}
