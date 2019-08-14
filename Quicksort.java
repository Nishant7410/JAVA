import java.util.*;
public class Quicksort
{
    
    public static int partition(int ar[],int s,int e)
    {
        int i=s-1;
        int x=ar[e];
        int j=s;
        int temp;
        while(j<=e-1)
        {
            if(ar[j]<=x)
            {
                i++;
                temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
            j++;
        }
        temp=ar[i+1];
        ar[i+1]=ar[e];
        ar[e]=temp;
        return (i+1);
    }
    public static void quicksort(int ar[],int s,int e)
    {
        if(s<e)
        {
        int p=partition(ar,s,e);
        quicksort(ar,s,p-1);
        quicksort(ar,p+1,e);
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        quicksort(ar,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}