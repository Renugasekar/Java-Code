interface Function
{
	void eat();
}
public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
		Function f=() ->System.out.println("Nice Fruit");
		f.eat();
	}

}
