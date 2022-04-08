
public class EnhancedLoop 
{	
	public static void main(String[] args) 
	{
		/*ONE DIMENSIONAL ARRAY*/
		
		int a[]= {2,3,4,5};
		for(int n:a)
		{
			System.out.println(n);
		}
			System.out.println();
			
		/*TWO DIMENSIONAL ARRAY*/
		
			int d[][]= {
							{2,3,4,5},
							{9,3,6,5},
							{3,1,4,7}
						};
							for(int k[]:d)
							{
								for(int l:k)
								{
									System.out.print(""+l);
								}
				
									System.out.println();
							}
									System.out.println();
}
}
