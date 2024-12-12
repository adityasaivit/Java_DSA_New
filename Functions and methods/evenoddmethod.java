import java.util.*;

class evenoddsum
{

	public void evenodd(int n)
	{
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
	public static void main(String args[])
	{

		evenoddsum e=new evenoddsum();

		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int n=sc.nextInt();

			if(n==-1)
			{
				break;

			}
			else{
				e.evenodd(n);
			}
		}
	}
}
