import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface
{

	public static void main(String[] args) 
	{
		Map<String,String> map= new HashMap<>();
		map.put("NAME","RENU");
		map.put("ACTOR","STEFAN");
		map.put("CEO","SALVATORE");
		
		Set<String> keys=map.keySet();
		
		for(String Key:keys)
		{
			System.out.println(Key+":"+map.get(Key));
		}
	}

}
