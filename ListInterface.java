import java.util.List;
import java.util.ArrayList;

public class ListInterface
{

	public static void main(String[] args) 
	{
		List values= new ArrayList();
		values.add(7);
		values.add(4);
		values.add(0,9);
		values.add("8");
		
		for(Object  o:values)
		{
			System.out.println(o);
		}
	}

}
