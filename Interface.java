interface Writer
{
	void read();
}
class Pen implements Writer
{
	public void read()
	{
		System.out.println("Hi Priya");
	}
}

public class Interface 
{
	public static void main(String[] args) 
	{
		Pen p=new Pen();
		p.read();
		
	}
}
