import java.util.*;
public class Freq
{
public static void main(String a[])
{
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    int h[]=new int[1000];
    for(int i=0;i<n;i++)
        h[ar[i]]++;
    for(int i=0;i<1000;i++)
    {
        if(h[i]==1)
            System.out.println(i);
    }
}
}