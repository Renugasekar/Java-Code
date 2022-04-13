abstract class Alpha
{
	public abstract void lemon(); //declared //abstract class
}
class Beta extends Alpha
{
	public void lemon()
	{
		System.out.println("HI");  //defined //concrete class
	}
}
public class AbstractKeyword {
	public static void main(String[] args)
	{
		Beta obj=new Beta();
		obj.lemon();
	}

}

