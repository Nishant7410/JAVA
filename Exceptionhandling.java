import java.util.*;
import java.io.*;
public class Exceptionhandling
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int a;
a=sc.nextInt();
try
{
if(a<0)
throw new ArithmeticException("mera error");
}
    finally{
        System.out.println("phala m chalunga");
    }
}
}