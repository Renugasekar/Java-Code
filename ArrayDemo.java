
public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		/*ONE DIMENSIONAL ARRAY*/
		
		int a[]= {2,3,4,5};
			for(int i=0;i<4;i++)
			{
				System.out.println(a[i]);
			}
				System.out.println();
				
				/*TWO DIMENSIONAL ARRAY*/
				
					int d[][]= {
									{2,3,4,5},
									{9,3,6,5},
									{3,1,4,7}
								};
									for(int i=0;i<3;i++)
									{
										for(int j=0;j<4;j++)
										{
											System.out.print(""+d[i][j]);
										}
						
											System.out.println();
									}
											System.out.println();
									
								/*JAGGED ARRAY*/
									
					int e[][]= {
							{2,3,4},
							{9,3,6,5},
							{3,1,4,7,9}
						};
							for(int i=0;i<e.length;i++)
							{
								for(int j=0;j<e[i].length;j++)
								{
									System.out.print(""+e[i][j]);
								}
				
									System.out.println();
							}
	}
}

