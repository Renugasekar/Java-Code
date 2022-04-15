import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ComparatorInterface
{

	public static void main(String[] args) 
	{
		
		List<Integer> values=new ArrayList<>();
		values.add(404);
		values.add(399);
		values.add(286);
		values.add(607);
		
		Collections.sort(values,(i,j)->i%10>j%10?1:-1);
		for(Integer o:values)
		{
			System.out.println(o);
		}
	}

}
