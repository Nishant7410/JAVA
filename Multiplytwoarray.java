import java.util.*;
import java.math.*;
public class Multiplytwoarray
{
    public static void main(String ar[])throws Exception
    {
        int n;
        Scanner sc=new Scanner(System.in);
        String a="";
        String b="";
        n=sc.nextInt();
        while(n!=-1)
        {
            a+=String.valueOf(n);
            n=sc.nextInt();
        }
        n=sc.nextInt();
        while(n!=-1)
        {
            b+=n;
            n=sc.nextInt();            
        }
        BigInteger f=new BigInteger(a);
        BigInteger s=new BigInteger(b);
        f=f.multiply(s);
        String str=f.toString();
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i)+" ");
        }
    }
}