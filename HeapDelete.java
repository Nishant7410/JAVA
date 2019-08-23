import java.util.*;
public class HeapDelete
{
    static int n;
    public static void heapify(int ar[],int i)
    {
        int l=2*i+1;
        int r=2*i+2;
        int max=0;
        if(l<ar.length&&ar[l]>ar[i])
            max=l;
        else
            max=i;
        if(r<ar.length&&ar[r]>ar[i])
            max=r;
        if(max!=i)
        {
            int temp=ar[max];
            ar[max]=ar[i];
            ar[i]=temp;
            heapify(ar,max);
        }
    }
    public static void insertheapify(int ar[],int i,int j)
    {
        if(i<0)
            return;
        else if(ar[i]>ar[j])
            return;
        else
        {
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            insertheapify(ar,i-1,i);
        }
    }
    public static void deletemax(int ar[])
    {
        ar[0]=ar[n-1];
        n--;
        heapify(ar,0);
    }
    public static void insert(int ar[],int c)
    {
        ar[n++]=c;
        insertheapify(ar,n/2,n-1);
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[100];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=n/2;i>=0;i--)
            heapify(ar,i);
       // deletemax(ar);
        insert(ar,500);
        for(int i=0;i<n;i++)
            System.out.println(ar[i]);
    }
}