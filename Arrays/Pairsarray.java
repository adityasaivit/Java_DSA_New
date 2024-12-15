public class Pairsarray
{
	public static void main(String args[])
	{
		int arr[]={4,5,3,6};
		int l=arr.length;

		for(int i=1;i<=l;i++)
		{
			for(int j=i+1;j<=l;j++);
			{
				System.out.print("("+arr[i-1]+","+arr[j-1]+") ");
			}
			System.out.println();
		}
	}
}
