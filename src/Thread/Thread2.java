package Thread;

//class ThreadExmaple extends Thread
//{
//	public void run() {
//		
//		System.out.println("thread using thread class");
//	}
//}
//public class Thread2 {
//
//	public static void main(String[] args) {
//			
////		ThreadExmaple t=new ThreadExmaple();
////		t.start();	
//	}
//}

class ThreadExmaple implements Runnable
{
	public void run() {
		
		System.out.println("thread using thread class");
	}
}
public class Thread2 {

	public static void main(String[] args) {
			
		ThreadExmaple t=new ThreadExmaple();
		Thread t1=new Thread(t);
		t1.start();
	}
}
