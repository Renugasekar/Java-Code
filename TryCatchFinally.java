public class TryCatchFinally {

	public static void main(String[] args) 
	{
		try
		{
			int i=8;
			int j=0;
			int k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something Wrong");
		}
		finally
		{
			System.out.println("Try Again");
		}

	}

}
