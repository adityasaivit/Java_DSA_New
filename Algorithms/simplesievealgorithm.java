
// simple sieve algorithm used to find the all the prime numbers within a particular range

import java.util.*;
public class simplesievealgorithm {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean isprime[]=new boolean[n+1];
        for(int i=2;i<n+1;i++)
        {
            isprime[i]=true;
        }
        

        for(int j=2;j*j<=n;j++)
        {
            if(isprime[j]==true)
            {
                for(int k=j+1;k<=n;k++)
                {
                    if(k%j==0)
                    {
                        isprime[k]=false;
                    }
                }
            }
        }

        int count=0;

        for(int k1=2;k1<=n;k1++)
        {
            if(isprime[k1]==true)
            {
                count++;
                System.out.println(k1+" ");
            }
        }

        sc.close();

        System.out.println("\nThe Total number of prime Numbers were:"+count);



    }

    
}
