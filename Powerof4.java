import java.util.*;
public class Powerof4
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n,store,t=0,c=0;
        n=sc.nextInt();
        store=n;
        while(n>0)
        {
            n=n&(n-1);
            t++;
        }
        int s=0;
        if(t==1)
        {
            while(s<32)
            {
                if(((store>>s)&1)!=0)
                   c=1;
                s+=2;
            }
        }
        else
            c=0;
        if(c==1)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}