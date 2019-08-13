import java.util.*;
public class Setbits
{
    public static void main(String a[])
    {
        int n,t=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=0;
        while(n>0)
        {
            n=n&(n-1);
            t++;
        }
        System.out.print(t);
    }
}