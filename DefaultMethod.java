interface Vampires
{
	void diaries();
	default void werewolf()
	{
		System.out.println("The Originals");
	}
}
class Book implements Vampires
{
	public void diaries()
	{
		System.out.println("The Vampire Diaries");
	}
}
public class DefaultMethod {

	public static void main(String[] args) 
	{
		Book b=new Book();
		b.werewolf();
		b.diaries();
		
	}

}
