class Calculator
{
	public void add(int i,int j)
	{
		
		System.out.println(i+j);
		
	}
}
class A extends Calculator
{
	public void sub(int i,int j)
	{
		System.out.println(i-j);
	}
}
public class Inheritance 
{

	public static void main(String[] args) 
	{
		
		A obj=new A();
		obj.add(3, 6);
		obj.sub(8, 6);
		
	}

}
