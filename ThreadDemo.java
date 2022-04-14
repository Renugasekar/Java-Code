class Hat extends Thread
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
class Cap extends Thread
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

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		Hat obj1=new Hat();
		Cap obj2=new Cap();
		obj1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		obj2.start();
	}

}
