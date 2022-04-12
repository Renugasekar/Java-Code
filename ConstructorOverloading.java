class Sum
{
	public Sum()
	{
		System.out.println("HI UNIVERSE");
	}
	public Sum(int l, int o)
	{
		System.out.println(l-o);
	}
	public Sum(int v, int e,int s)
	{
		System.out.println(v+e+s);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		Sum s=new Sum(4,3,9);
		
	}

}
