package Thread;

class ThreadDemo extends Thread 
{
	public void run() {
		System.out.println("thread running");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		
		ThreadDemo t=new ThreadDemo();
		t.start();
		
	}
}
