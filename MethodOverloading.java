class Casio
{
	public void add()
	{
		System.out.println("HI UNIVERSE");
	}
	public void add(int l, int o)
	{
		System.out.println(l-o);
	}
	public void add(int v, int e,int s)
	{
		System.out.println(v+e+s);
	}
}
public class MethodOverloading {

	public static void main(String[] args) 
	{
		Casio c=new Casio();
		c.add();
		c.add(10,6);
		c.add(10,6,4);
	}

}
