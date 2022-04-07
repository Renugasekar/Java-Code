class Study
{
	int num1,num2,sum;
	public void perform()
	{
		sum=num1+num2;
		System.out.println(+sum);
	}
}
public class ClassObject {

	public static void main(String[] args) 
	{
		Study s=new Study();
		s.num1=5;
		s.num2=6;
		s.perform();
		
	}

}
