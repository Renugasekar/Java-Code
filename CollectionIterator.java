import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionIterator 
{
	public static void main(String[] args) 
	{
		Collection values=new ArrayList();
		values.add(5);
		values.add(9);
		values.add(4);
		
		Iterator it=values.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
