import java.util.Scanner;
public class UserInput
{
	public static void main(String[] args)
	{
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		i=sc.nextInt();
		System.out.print("Enter Second Number:");
		j=sc.nextInt();
		int k=i+j;
		int l=i-j;
		int m=i*j;
		double n=(double)i/j;
		int o=i%j;
		System.out.println("The Addition Value is:"+k);
		System.out.println("The Subtraction Value is:"+l);
		System.out.println("The Multiplication Value is:"+m);
		System.out.println("The Division Value is:"+n);
		System.out.println("The Modulus Value is:"+o);
	}
}
