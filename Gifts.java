import java.util.*;
public class Gifts
{
    public static void main(String a[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                
                }
        int i,k;
        int min=ar[m-1]-ar[0];
        for(i=1;i<n-m;i++)
        {
            k=ar[i+m-1]-ar[i];
            if(min>k)
              min=k;
        }
        System.out.print(min);
    }
}