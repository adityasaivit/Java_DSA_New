public class Reversearray
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4};
		int l=arr.length;

		int s=0;
		int f=l-1;

		int it=l/2;

		for(int i=1;i<=it;i++)
		{
			int temp=arr[s];
			arr[s]=arr[f];
			arr[f]=temp;

			s+=1;
			f--;

		}

		for(int j=1;j<=l;j++)
		{
			System.out.print(arr[j-1]);
		}
	}
}