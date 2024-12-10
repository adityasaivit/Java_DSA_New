import java.util.*;
public class bubblesort {
    public static void main(String args[])
    {
        int arr[]={5,3,7,6,1};
        int length=arr.length;
        System.out.println(length);

        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        for(int k=1;k<=length;k++)
        {
            System.out.print(arr[k-1]);
        }
        
    }
    
}
