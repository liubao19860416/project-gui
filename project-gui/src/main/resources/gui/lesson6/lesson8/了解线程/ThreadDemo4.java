public class ThreadDemo4
{
	public static void main(String [] args) 
	{
		//ThreadTest t=new ThreadTest();
	   new	ThreadTest().start();
	    	System.out.println("123");
	  new 	ThreadTest().start();
	  	System.out.println("1234");
	   new	ThreadTest().start();
	   new	ThreadTest().start();
	}
}
class ThreadTest extends Thread  
{
	private int tickets=30;
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			System.out.println(Thread.currentThread().getName() +
				" is saling ticket " + tickets--);
		}
	}
}