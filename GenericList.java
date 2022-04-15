import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GenericList 
{

	public static void main(String[] args)
	{
		List<Integer> values=new ArrayList<>();
		values.add(2);
		values.add(0,3);
		values.add(6);
		values.add(11);
		//values.add("4");
		//values.add("5");
		
		Collections.reverse(values);
		
		for(Integer o:values)
		{
			System.out.println(o);
		}

	}

}
