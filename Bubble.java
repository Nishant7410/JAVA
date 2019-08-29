import java.util.*;
public class Bubble
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}