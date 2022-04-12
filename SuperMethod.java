
class B
{
	public B()
	{
		System.out.println("Hi Beta");
	}
	public B(int i)
	{
		System.out.println("Hello Beta");
	}
}
class C extends B
{
	public C()
	{
		
		System.out.println("Hi c");
	}
	public C(int i)
	{
		super(i);
		System.out.println("Hello c");
	}
}
public class SuperMethod 
{

	public static void main(String[] args)
	{
		C obj=new C(7);
		

	}

}
