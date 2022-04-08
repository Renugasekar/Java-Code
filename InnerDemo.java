class Outer
{
	static int a;
	public static void show()
	{
		System.out.println("Hello");
	}

 static class Inner
{
	public void display()
	{
		System.out.println("World");
	}
}
}
public class InnerDemo {

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
