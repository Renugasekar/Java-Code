interface P
{
	void eat();
	default void show()
	{
		System.out.println("Show 1");
	}
}
interface Q
{
	default void show()
	{
		System.out.println("Show 2");
	}
}
class Ride implements P,Q
{
	public void eat()
	{
		System.out.println("Nice Show");
	}
	
	public void show()
	{
		P.super.show();
		Q.super.show();
		System.out.println("Show 3");
	}
}

public class MultipleInterface {

	public static void main(String[] args) 
	{
	Ride r=new Ride();
	r.eat();
	r.show();

	}

}
