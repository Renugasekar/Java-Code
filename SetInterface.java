import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetInterface
{

	public static void main(String[] args) 
	{
		Set<Integer> values= new HashSet<>();
		values.add(7);
		values.add(4);
		values.add(4);
		values.add(8);
		values.add(3);
		
		for(Object  o:values)
		{
			System.out.println(o);
		}
	}

}
