interface Earth
{
	void eat();
	static void show()
	{
		System.out.println("HELLO UNIVERSE");
	}
}
public class StaticInterface {

	public static void main(String[] args) 
	{
		Earth.show();
	}

}
