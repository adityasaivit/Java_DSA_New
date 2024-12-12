import java.util.*;

public class Factorial
{

	public static int factorial(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}

		return product;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Number:");

		int n=scan.nextInt();

		System.out.println("The Factorial is "+factorial(n));
	}
}