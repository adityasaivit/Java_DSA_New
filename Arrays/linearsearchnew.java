import java.util.*;
public class linearsearchnew
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of Elements:");
		int n=scan.nextInt();

		int arr[]=new int[n];

		for(int i=1;i<=n;i++)
		{
			arr[i-1]=scan.nextInt();
		}

		System.out.print("Enter the Number to be found:");
		int val=scan.nextInt();
		for(int j=1;j<=n;j++)
		{
			if(arr[j-1]==val)
			{
				System.out.println("The number was found at "+(j-1)+" index");

			}
		}
	}
}