import java.util.*;
public class linearsearch
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of elements in Array:");
		int n=scan.nextInt();

		int arr[]=new int[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=scan.nextInt();

		}

		System.out.print("Enter the Element you want to search:");
		int key=scan.nextInt();

		for(int j=1;j<=n;j++)
		{
			if(key==arr[j-1])
			{
				System.out.println("Element was found at "+(j-1)+" index");
			}
		}
	}
}