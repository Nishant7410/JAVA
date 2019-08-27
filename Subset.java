import java.util.*;
public class Subset
{
    public static void set(int ar[],int s,int l,int res[])
    {
        for(int i=0;i<l;i++)
            System.out.print(res[i]);
        System.out.println();
        for(int i=s;i<ar.length;i++)
        {
            res[l]=ar[i];
            set(ar,s+1,l+1,res);
        }
    }
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int res[]=new int[n];
        set(ar,0,0,res);
    }
}