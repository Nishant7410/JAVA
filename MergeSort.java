import java.util.*;
public class MergeSort
{
    public static void merge(int ar[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++)
            L[i]=ar[l+i];
        for(int i=0;i<n2;i++)
            R[i]=ar[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])
            {
                ar[k]=L[i];
                i++;
            }
            else
            {
                ar[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            ar[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            ar[k]=R[j];
            j++;
            k++;
        }
        
    }
    public static void mergeSort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        mergeSort(ar,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}