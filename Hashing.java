import java.util.*;
public class Hashing
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
            ar[i]=sc.nextInt();
     int hash[]=new int[1000];
        for(int i=0;i<5;i++)
            hash[ar[i]]++;
        for(int i=0;i<1000;i++)
        {
            if(hash[i]!=0)
            System.out.println(i+"->"+hash[i]);
        }
    }
}