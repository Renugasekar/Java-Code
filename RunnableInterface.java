class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
class Hifi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hifi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class RunnableInterface
{
	public static void main(String[] args) 
	{
		Hi obj1=new Hi();
		Hifi obj2=new Hifi();
		Thread t1=new Thread(obj1);
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		Thread t2=new Thread(obj2);
		t2.start();
	}

}
