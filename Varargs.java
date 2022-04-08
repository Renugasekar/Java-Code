class Calc
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}return sum;
	}
}
public class Varargs
{
	public static void main(String[] args) 
	{
		Calc obj=new Calc();
		System.out.print(obj.add(4,5,6,7,8,9));
	}
}
