interface Food
{
	void eat();
}

public class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		Food f=new Food() 
						{
							public void eat()
							{
								System.out.println("Nice Fruit");
							}
						};
		f.eat();
		
	}
}
