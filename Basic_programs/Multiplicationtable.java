import java.util.*;

public class Multiplicationtable
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("enter the number to display the multiplicatoion table:");
		int n=scan.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}