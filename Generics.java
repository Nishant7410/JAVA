import java.util.*;
public class Generics
{
    public static <E> void fun(E ar[])
    {
        for(E x:ar)
            System.out.println(x);
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Integer ar[]=new Integer[5];
        for(int i=0;i<5;i++)
            ar[i]=sc.nextInt();
        fun(ar);
    }
}