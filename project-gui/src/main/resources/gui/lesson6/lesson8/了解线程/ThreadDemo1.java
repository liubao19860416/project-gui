public class ThreadDemo1
{
	public static void main(String args[])
	{
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
	//	while(true)
	//	{
	//		System.out.println("main thread is running");
	//	}	
	}
}
 class TestThread extends Thread  	
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName() + 
			"¡¡is running");
		}
	}
} 