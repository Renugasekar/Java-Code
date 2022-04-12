class M
{
	public void show()
	{
		System.out.println("WORLD");
	}
	
}
class D extends M
{
	public void show()
	{
		super.show();
		System.out.println("UNIVERSE");
	}
}
class E extends D
{
	public void show()
	{
		super.show();
		System.out.println("EARTH");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args)
	{
		D obj1=new E(); 
		obj1.show();
		
		/*
		  M obj1=new D()
		  obj1.show();
		 
		  obj1=new E();
		  obj1.show();  //dynamic method dispatch
		 
		 */
		
		
	
	}
}
