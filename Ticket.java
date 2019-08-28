import java.util.*;
public class Ticket
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int i=0,c=0;
        while(ar[p]!=0)
        {
           if(i==n)
               i=0;
            else
            {
                if(ar[i]!=0)
                {
                ar[i]-=1;
                c++;
                }
                i++;
              
            }
        }
        System.out.print(c);
    }
}