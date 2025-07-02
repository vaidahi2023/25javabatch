package Basic;

//2 12 4 10
//2 12 
//2 4 10 12
public class sorting {

	public static void main(String[] args) {
		
			int a[]= {12,3,6,10,1},i,j,temp;
			
			// c=a
			//a=b
			//b=a
			
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
			for(int k:a)
			{
				System.out.println(k);
			}
	}
}