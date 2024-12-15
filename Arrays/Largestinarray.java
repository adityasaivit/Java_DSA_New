import java.util.*;
public class Largestinarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Number of elements:");
		int n=sc.nextInt();

		int arr[]=new int[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=sc.nextInt();
		}

		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int j=1;j<=n;j++)
		{
			if(arr[j-1]>max)
			{
				max=arr[j-1];
			}
			if(arr[j-1]<min)
			{
				min=arr[j-1];
			}
		}
		System.out.println("The maximum value of the array is "+max);
		System.out.println("The minimum value of the array is "+min);
	}
}